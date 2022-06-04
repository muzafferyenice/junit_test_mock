package com.app;

import java.util.Arrays;
import java.util.Random;

public class C04SortArraysASpecifiedTime {

	
	
	public void sortArraysInASpecifiedTime() {
		Random random=new Random();
		int[] arr=new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=random.nextInt(100);
			
		}
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			
	}
}
