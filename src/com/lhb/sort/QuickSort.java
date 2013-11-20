package com.lhb.sort;

import com.lhb.util.Swap;

public class QuickSort {
	static int[] data;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data = new int[]{19,3,6,35,4,34,4,45,22,44};
		sort(0, data.length-1);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+ " ");
		}
	}
	
	private static void sort(int start,int end) {
		if (start >= end ) {
			return;
		}
		int pivot = data[end];
		int index = partionIt(start,end,pivot);
		sort(start ,index-1);
		sort(index+1,end);
	}
	
	private static int partionIt(int start,int end,int pivot){
		
		int left = start-1;
		int right = end;
		while(true){
			while(data[++left] < pivot);
			while(right > 0 && data[--right] > pivot);
			if (left>=right) {
				break;
			} else {
				//int temp = data[left];data[left] = data[right];data[right] = temp;
				Swap(left,right);
			}
		}
		
		//int temp2 =  data[left]; data[left] = data[end];data[end] = temp2;
		Swap(left, end);
		return left;
		
	}


	private static void Swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp = data[i];data[i] = data[j];data[j] = temp;
		
	}

}

