package com.aditya.mlabs.tester;

public class FindSwappedIndices {

	public static void main(String args[]){
		
		int[] arr = new int[7];
		arr[0] = 1;
		arr[1] = 4;
		arr[2] = 7;
		arr[3] = 18;
		arr[4] = 11;
		arr[5] = 15;
		arr[6] = 9;
		
		swap(arr);
		
		
	}

	private static void swap(int[] arr) {
		int indexA = 0;
		int indexB = 0;
		boolean isArrSortedNow = false;
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[j] < arr[i]){
					// Swap these two numbers.
					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
					// check if array now is a sorted one now
					isArrSortedNow = isSorted(arr);
					if(isArrSortedNow){
						indexA = i;
						indexB = j;
						break;
					} else {
						int b = arr[i];
						arr[i] = arr[j];
						arr[j] = b;
					}
				}
			}
			if(isArrSortedNow){
				break;
			}	
		}
		System.out.println(indexA);
		System.out.println(indexB);
	}
	
	private static boolean isSorted(int[] a){
		for (int i = 0; i < a.length - 1; i++) {
	        if (a[i] > a[i + 1]) {
	            return false; // It is proven that the array is not sorted.
	        }
	    }
	    return true;
	}
	
}

