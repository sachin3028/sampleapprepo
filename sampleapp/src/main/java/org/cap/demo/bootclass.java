package org.cap.demo;

public class bootclass {

	public static void main(String[] args) {
		System.out.println("helloworld");
		show();

	}
   public static void show() {
	   int[] arr= {12,36,56,56};
	   for(int i=0;i<100;i++)
	   {
		   System.out.println(arr[i]);
	   }
	   System.out.println("show method here");
   }
}
