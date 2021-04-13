package com.chainsys;
public class Valid {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int x =addition(a,b);
		System.out.println(x);
	check(a);
	square();

	}
	public static void check(int X) {
		boolean valid =false;
		if(X>0) {
			valid=true;
		}
		else {
			valid=false;
		}
		System.out.println(valid);
		
	}
	public static int addition(int n,int m) {
		int c =m+n;
		return c;
		
		
	}
	public static void square() {
		int no =28;
		System.out.println(Math.sqrt(no));
	}

}
