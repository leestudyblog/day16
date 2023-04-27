/*
 연산 담당
 1. 온도를 올리고 내리는 연산
 2. 온도는 TemDTO에 있는 변수 활용
 3. private int temp =10;
 */
package pra;

import java.util.Scanner;

public class TempService {
	private TemDTO DTO = new TemDTO();//데이터 받아오기
	Scanner sc = new Scanner(System.in);
	int iuputNum=0;
	private int temp =10;
	
	public void Up() {
		System.out.println("온도올리기");
		System.out.println("▲");
		iuputNum = sc.nextInt();
		if(iuputNum!=0) {
			temp +=iuputNum;
		}else {
			System.out.println("다시입력");
		}

	}
	public void Down() {
		System.out.println("온도내리기");
		System.out.println("▼");
		iuputNum = sc.nextInt();
		if(iuputNum!=0) {
			temp -=iuputNum;
		}else {
			System.out.println("다시입력");
		}

	}
	public void Show() {
		System.out.println("현재설정정보");
		System.out.println("현재 온도 :" + temp);
	}

}
