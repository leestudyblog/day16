package test.care;

import test.java.TestClass01; //다른 패키기 참조
//import test.java.TestClass02;
//import test.java.TestClass03;
 import java.util.*;

import test.date.Date;
import test.java.*;

//이름이 같은 패키지 참조 예
public class Main01 {
	public static void main(String[] args) {
		//public 생략예
		Test01 t= new Test01();
		t.test();
		t.test();
		//t.num =111;
		TestClass01 t01 = new TestClass01();
		t01.test();
		TestClass02 t02=new TestClass02();
		TestClass03 t03= new TestClass03();
		//각 다른 패키지에서 date 참조
		Date d = new Date();
		d.date();
		
		test.java.Date  d01 =  new test.java.Date();
		d01.date();
		
		java.util.Date d02 = new java.util.Date();
		System.out.println(d02);
		
	}
}
