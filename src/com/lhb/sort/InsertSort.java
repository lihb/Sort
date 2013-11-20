package com.lhb.sort;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertSort {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args)  {
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
			
		for (int i = 1; i < data.length; i++) {
			for (int j = i; j >0&&data[j]<data[j-1] ; j--) {
				swap(data,j,j-1);
			}
		}
	}

	private static void swap(int[] data, int j, int i) {
		// TODO Auto-generated method stub
		int temp = data[j];
		data[j] = data[i];
		data[i] = temp;
	}

}
