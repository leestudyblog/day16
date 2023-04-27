//하나의 문서에 전부 만든 경우
package test_dto;

import java.util.Scanner;

 class TestClass07 {
	   private int age;
	   private String name;
	   public void myInput() {
	      Scanner input = new Scanner(System.in);
	      System.out.println("이름 입력");
	      name = input.next();
	      System.out.println("나이 입력");
	      age = input.nextInt();
	   }
	   public void setAge() {
	      age = age-1;
	   }
	   public void display() {
	      myInput();
	      setAge();
	      System.out.println("이름 : "+name);
	      System.out.println("만 나이 : "+age);
	      /*
	       입력, 출력, 나이 만으로 연산하는 각각의 기능을 만드세요
	       변수는 인스턴스 변수로 변경하여 사용하세요
	       */
	   }
	}



public class MainClass01 {
	public static void main(String[] args) {
		
		int age=0;
		String name=null;
		Scanner input = new Scanner(System.in);
		int num;
		MemverSetvice m= new MemverSetvice();
		while(true) {
			System.out.println("1.이름입력 : ");
			System.out.println("2.나이입력 : ");
			System.out.println("3.모든내용출력 : ");
			System.out.println("4.종료 ");
			num=input.nextInt();
			switch (num) {
			case 1 : 
				m.inputName();
				break;
			case 2 :
				m.inputAge();
			    break;
			case 3 : 
				m.print();
				break;
			case 4 : break;
			
			}
		}
	      
		
	     // age = age-1;
	      


	}

}
