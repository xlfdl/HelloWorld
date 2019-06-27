package SampleTest;

import org.testng.annotations.Test;

public class SampleFunction {
	
	
//  @Test
//  public void func(int a, int b) {
//	  
//	  System.out.println(a+b);
//  }
//  
//  @Test
//  public void func2() {
//	  
//	  System.out.println(Returnfunc("peter"));
//	  
//  }
//  
//  @Test
// public String Returnfunc(String mm) {
//	  
//	  String ss="hello  " + mm;
//	  return ss;
//  }
  
  
  @Test
  public void StringFunc() {
	  
	  String ss="hello I am a professional tester ppp";
	  String aaa="hello I am a professional tester ppp";
	  
	  String temp[]=ss.split(" ");
	  
	  boolean kk=ss.equals(aaa); // string compare
	  int t=ss.length();
	  String ccc=ss.substring(0, 7); //return sub string from 0 to 7
	  
	  char dd=ss.charAt(4);       // return char at position of 4
	  int gg=ss.indexOf("p");    // return position of p, search from begining
	  int gg2=ss.indexOf("p",8);  //search from 8 position
	  int gg3=ss.indexOf("jeff");  //return -1 if not contain certain search term
	  System.out.println("position is " + temp[0]);
	  
	  
	  
  }
  
  
  
  
  
  
}
