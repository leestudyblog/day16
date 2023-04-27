//메소드 - 기능 나눔
package test_dto;

import java.util.Scanner;

public class MemverSetvice {
	
	Scanner input = new Scanner(System.in);
	MemberDto dto = new MemberDto();
	
	public void inputName(){
		System.out.println("이름 입력");
	    String name = input.next();//지역변수
	    dto.setName(name);//dto name에 입력 받은 name에 추가
	}
	
	public void inputAge() {
		System.out.println("나이 입력");
	   //dto.setAge(age) = input.nextInt();아래와 같은 내용
	    dto.setAge(input.nextInt());
	}	
	
	public void print() {
		 System.out.println("이름 : "+dto.getName()); // 초기화 필요
	     int age = dto.getAge();//위아래 둘다 가능
		 System.out.println("만 나이 : "+age);
	}
	
}
