//문제1
/*보여지는 공간
 1. 온도올리기
 2. 온도내리기
 3. 현재 설정 정보
 */
package pra;

import java.util.Scanner;

public class MainCalss01 {

	public static void main(String[] args) {
		int temp =10;
		Scanner sc = new Scanner(System.in);
		
		TempService ts = new TempService();
		TemDTO td = new TemDTO();
		
		boolean bool = true;
		
		while(bool) {
			System.out.println("1.온도올리기");
			System.out.println("2.온도내리기");
			System.out.println("3.현재설정정보");
			System.out.println(">>>>>>");
			
			int num = sc.nextInt();
			switch (num) {
			case 1 : 
				ts.Up();
				ts.Show();
				break;
			case 2 : 
				ts.Down();
				ts.Show();
				break;
			case 3 : 
				ts.Show();
				break;
			}
		}
		
	}
 
}
