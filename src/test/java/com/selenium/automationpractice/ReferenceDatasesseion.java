package com.selenium.automationpractice;

public class ReferenceDatasesseion {

	public static void main(String[] args) {
		
		//literals
		
		String str3="Java";
		str3="ajo";
		
		//object
		String str2 = new String("Python");
		String str4 = new String("Python");
		
		//strings are immutable
		
		
		//String methods
		//1.length
		
		String str1="Hello";
		String str5="Hello";
		String str8 ="Hai";
		String str7= "How are you";
		String str34= "           Hi     Heloo      ";
		
		String str6 = " " ;
		
	System.out.println(str1.length());
	

	//concat
	
	System.out.println(str8.concat(str1));
		
	//contains
	
	System.out.println(str1.contains("le"));
	//4.CharAt
	
	System.out.println(str1.charAt(3));
	
	//Startswith
	System.out.println(str7.startsWith("you"));

	//equals
	System.out.println(str1.equals(str5));
	
	//isEmpty
	
	System.out.println(str1.isEmpty());

	System.out.println(str6.isEmpty());
	
	// 9.indexOf
	 System.out.println(str1.indexOf('e'));

// replace
	 System.out.println(str7.replace("How are you", "Fine"));
	 
	 //trim
	 System.out.println(str34.trim());
	 
	 //tochararray
	 
	 String s= "hello";
	 
	 char[] chararray =s.toCharArray();
	 int  len  = chararray.length;
	 
	 for (int i=0;i<len ; i++){
		 System.out.print(chararray[i] + " "); 
	 }
	
	 
	}

}
