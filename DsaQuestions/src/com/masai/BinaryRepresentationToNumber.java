package com.masai;

public class BinaryRepresentationToNumber {
	public static int[] convertFromStringToArrayInt(String s) {
		int[] a= new int[s.length()];
		for(int r=0;r<s.length();r++) {
			a[r]=Integer.parseInt(Character.toString(s.charAt(r)));
		}
		
		return a;
	}
	public static int getNumber(int[] a) {
		int ans=0;
		int p=0;
		for(int d=a.length-1;d>=0;d--) {
			if(a[d]==1) {
				ans+=(int)Math.pow(2, p);
					
			}
			p++;
		}
		
		return ans;
	}
	public static void main(String[] args) {
		    String str="00000000000000000000000000000111";
		    int[] arr=convertFromStringToArrayInt(str);
		    int ans=getNumber(arr);
		    System.out.println(ans);
	}
}
