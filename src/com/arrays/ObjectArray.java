package com.arrays;

import java.util.ArrayList;


public class ObjectArray {

	public static void main(String[] args) {


	/*	
	  Object is a class
	  used to store different data type values
	 */
		
		
		//1.one dimension
		Object[] obj = new Object[3];
		obj[0]="tom";
		obj[1]='a';
		obj[2] = 12;
		
		System.out.println("size of one dimension object array is: "+obj.length);
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		
		System.out.println(" ");
		
		
		//2.two dimension Object array
		Object [][] objj = new Object[3][3];
		objj[0][0] = "Mr.";
		objj[1][0] = "Dr.";
		objj[2][0] = "Ms.";
		objj[0][1] = "tom";
		objj[1][1] = "peter";
		objj[2][1] = "jenny";
		objj[0][2] = 45;
		objj[1][2] = 55;
		objj[2][2] = 65;
		
		System.out.println("row size: "+objj.length);
		System.out.println("col size: "+objj[0].length);
		
		for(int i=0; i<objj.length; i++) {
			for(int j=0; j<objj[0].length; j++) {
				System.out.println(objj[i][j]);
			}
		}
		
		
		Object ob[] = {1,2,3,4,5,6,7,8,9};
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		myData.add(ob);
		
		//System.out.println(myData);
		
		
		
	}

}
