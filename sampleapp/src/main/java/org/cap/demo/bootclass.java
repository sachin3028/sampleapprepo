package org.cap.demo;

public class bootclass {

	public static void main(String[] args) {
		System.out.println("helloworld");
		show();

	}
   public static void show() {
	   int[] arr= {1,2,3,4,5};
	   int sum=0;
	   for(int n:arr) {
		   sum+=n;
		   System.out.println(n);
	   }
	   System.out.println("show method here");
   
    }
}
