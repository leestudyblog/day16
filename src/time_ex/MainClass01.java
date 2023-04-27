//time 받아오기
package time_ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass01 {

	public static void main(String[] args) {
		long t = System.currentTimeMillis(); //long type
		//형변환 가능, 값이 다를 수 있음 int t= (int)System.currentTimeMillis(); 
		System.out.println(t); //현재 시간 초단위로 가져옴
		
		
		Date d=new Date();
		System.out.println(d); // 요일 - 월 - 일 - 시 -분 -초
		
		//포맷 변경
		SimpleDateFormat s= 
				new SimpleDateFormat("yyyy-MM_dd일 aaa hh시 mm분 ss초");//형식 표현  aaa(오전 오후)
		String s_t = s.format(d); 
		System.out.println(s_t);
		
		
	}

}
