package com.vanima.samples;

public class SampleFive {

	public static void main(String[] args) {
		String str1 = new String("java");   // Object 
		String str2 = new String("gft");    // object 
		
		String str3 = str1 ;   //reference 
		
		str1 = str1.concat(str2); // new object created and assigned to str1  
		str3 = str2.toUpperCase(); //new object got created and assigned to str3  
		 
		str3 = str2 ;  //reference 
		
		/*System.out.println("going into sleep mode");
		Thread.sleep(60000 * 3);
		System.out.println("coming out of sleep mode");*/
		
		String str5 = new String("Hello World!!!");
		System.out.println(str5);
		//stest();
	}
	
	public static void test() {
		String s1 = "java" ;
		String s2 = s1 ;
		String s3 = "gft" ;
		s1.concat("world");   //garbage collection 
		String s4 = new String("guys");   
		s2 = null ;  //garbage collection 
		
		System.out.println(s1);
		
	}
}
