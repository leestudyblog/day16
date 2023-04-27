package time_ex;

import java.io.IOException;

public class MainClass03 {
	public static void main(String[] args) {
		ProcessBuilder pro = new ProcessBuilder();
		String s = "calc";
		pro.command(s); //calc : 계산기  등 윈도우 명령어 실행
		
		try {
			pro.start();
		} catch (IOException e) {
			e.printStackTrace();
		} //실행
}
}
