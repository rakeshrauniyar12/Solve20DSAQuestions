package com.masai;

public class RotateSquareMatrix {
	public static void printRotateMatrix(int[][] a,int n) {
		int[][] a1= new int[n][n];
		int j=a[0].length-1;
		for(int g=0;g<a[0].length;g++) {
			
			for(int f=0;f<a[0].length;f++) {
				a1[g][f]=a[f][j];
			}
			j--;
		}
		for(int s=0;s<a[0].length;s++) {
			String bag="";
			for(int c=0;c<a[0].length;c++) {
				bag+=a1[s][c]+" ";
			}
			System.out.println(bag);
			bag="";
		}
	}
   public static void main(String[] at) {
	   int n=3;
	   int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
	   printRotateMatrix(arr,n);
   }
}
