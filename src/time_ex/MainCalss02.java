package time_ex;

public class MainCalss02 {
	// * sleep -기능 일시중지
	// * try catch - 예외처리
	
	public static void main(String[] args) {
		System.out.println("start");
		long start =System.currentTimeMillis();
		
		try {
			Thread.sleep(3000); // 3초 뒤에 다음 문장 실행
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		long end =System.currentTimeMillis();
		System.out.println("end");
		System.out.println((end - start )/ 1000); //지난 시간 계산 1000 = 1초
	}
	
}
