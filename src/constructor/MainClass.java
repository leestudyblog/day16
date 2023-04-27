package constructor;

/*
 constructor(생성자) 
 - 초기화 목적
 - 객체를 생성할 때 자동으로 호출된다
 - 클래스 이름과 동일한 메소드 이름을 가지며 반환타입, 값은 없다.  
 */

//메소드 오버로딩
class TestClass01{
	int age;
	public TestClass01(int age) {
		
		System.out.println(age + "생성자 호출");
		this.age = age;
	}
	public TestClass01(){ // 에러 줄이는 법
		System.out.println("기본 생성자");
	} //매개변수 전달 오류 줄이기
	public void test() {
		System.out.println("test");
	}
	public TestClass01(int a, int b){ // 에러 줄이는 법
		System.out.println("2개 받아옴");
	}
}

public class MainClass {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01(100); 
		t.test();
		TestClass01 t02 = new TestClass01(); 
		String s = new String();
		String s1 = new String("aaa");
		TestClass01 t03 = new TestClass01(10,20); 
		
	}
}
