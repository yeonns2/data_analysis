package lecture13;

public class App {

	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start(); 
		// 스레드를 통해 병렬적으로 처리할 수 있지만 생성하는데 비용이 있다. -> hello thread world 가 늦게 나오는 이유 
		
		System.out.println("Hello World");
		
		t.setName("T1"); //스레드 이름 설정 
		System.out.println(t.getName()); //이름 호출 
		System.out.println(t.getId()); //id는 자동생성 
		System.out.println(t.getState().name()); // 스레드의 상태 

	}

}
