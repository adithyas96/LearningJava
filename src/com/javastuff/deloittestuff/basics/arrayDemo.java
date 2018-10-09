package com.javastuff.deloittestuff.basics;

public class arrayDemo {
	public static void main1(String[] args) {
		int[] a = {1,10,3,1,5,6,8,3};
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length - i -1;j++){
				if(a[j]>a[j+1]){
					temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
					
			}
		}
		
		for(int i=0;i<a.length;i++)	
			System.out.println(a[i]);
	}
	
	public static void main2(String[] args) {
		Marker[] m;
		m = new Marker[3];
		for(int i=0;i<m.length;i++)
			m[i]= new Marker();
		System.out.println(m[2].getPrice());
		System.out.println(m[1]);
	}
	
	public static void main(String[] args) {
		int[][] a = {{1,2},{3,4,5,6},{7,8,9},{10}};
		/*a = new int[4][];
		a[0] = new int[2];
		a[1] = new int[4];
		a[2] = new int[3];
		a[3] = new int[1];
		
		a[0][0] = 12;
		a[0][1] = 15;
		a[1][0] = 16;
		a[1][1] = 20;
		a[1][2] = 38;
		a[1][3] = 42;
		a[2][0] = 44;
		a[2][1] = 45;
		a[2][2] = 47;
		a[3][0] = 48;
		
		for(int i=0;i<a[0].length;i++)
			System.out.println(a[0][i]);
		for(int i=0;i<a[1].length;i++)
			System.out.println(a[1][i]);
		for(int i=0;i<a[2].length;i++)
			System.out.println(a[2][i]);
		for(int i=0;i<a[3].length;i++)
			System.out.println(a[3][i]);
		*/
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}
}
