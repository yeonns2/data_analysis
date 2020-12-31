package practice;

import org.json.simple.JSONObject;
public class MyJSONHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject jsonHello=new JSONObject();
		jsonHello.put("message", "My JSON Hello World!");
		
		System.out.println(jsonHello);
	}

}
