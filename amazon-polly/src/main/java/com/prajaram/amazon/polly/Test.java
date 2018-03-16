package com.prajaram.amazon.polly;

 enum Test1  {
	test1;
	
	Test1(){
		System.out.println("Constructor");
	}
	
	public int x;
	
	int getValue() {
		return x;
	}
	
 }	
	public class Test extends Object {
	
public static void main(String[] args) {
	
	String s=new String("Raja");
	String s1="Raja";
	String s2="Raja";
	String s3=new String("Raja").intern();
	String s4=new String("Raja");
	System.err.println(s==s1);
	System.err.println(s1==s2);
	System.err.println(s==s2);
	System.err.println(s==s3);
	System.err.println(s2==s3);
	System.err.println(s==s4);
/*
	System.out.println(Test.INSTANCE);
	System.out.println(Test.INSTANCE);
	System.out.println(Test.INSTANCE);
	System.out.println(Test.INSTANCE);
	System.out.println(Test.INSTANCE);
	System.out.println(Test.INSTANCE);
	System.out.println(Test.INSTANCE);
	System.out.println(Test.INSTANCE);
	System.out.println(Test.INSTANCE);
	System.out.println(Test.INSTANCE);
	System.out.println(Test.INSTANCE);
	System.out.println(Test.INSTANCE);
	System.out.println(Test.INSTANCE);
	System.out.println(Test.INSTANCE);*/
}
	}

