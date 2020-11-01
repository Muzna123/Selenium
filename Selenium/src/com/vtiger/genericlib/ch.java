package com.vtiger.genericlib;

public class ch {
 public static void main(String[] args) {
	int [] arr={ 2, 3, 4, 5, 6};
	//int [] arr1=new arr1[arr.length];
	
	for(int i=0;i<arr.length;i++) {
		for(int j=1;j<arr.length;j++) {
			System.out.print(arr[i]+arr[j++]);
			System.out.print(arr[i]+arr[j]);
				
		}
	}
	
}
}
