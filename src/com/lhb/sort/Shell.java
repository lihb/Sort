package com.lhb.sort;

public class Shell {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {1,3,6,35,4,34,4,45,22,44,11,2,35,67,75,32,22,56,23,56,3,45,23,333,55,54,34,67,33,87};
		long start = System.currentTimeMillis();
		sort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+ " ");
		}
		System.out.println();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	private static void sort(int[] data){
		
		int N = data.length;
		int h = 1;
		while(h < N/3) h = 3*h + 1;
		while (h >= 1) {
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && data[j]<data[j-h];j = j-h ) {
					swap(data, j, j-h);
				}
			}
			h = h/3;
		}
	}

	private static void swap(int[] data, int j, int i) {
		// TODO Auto-generated method stub
		int temp = data[j];
		data[j] = data[i];
		data[i] = temp;
	}

}
