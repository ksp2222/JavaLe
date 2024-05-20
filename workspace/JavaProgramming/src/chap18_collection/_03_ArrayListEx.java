package chap18_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 사용자가 입력한 문자열을 StringBuilder 객체에 저장하고
		// 길이를 10씩 잘라서 List<StringBuilder>에 저장하고 출력하세요.
	
	// 1.사용자가 입력한 5개의 문자열을 List<String>에 저장해서 리턴하는 메소드를 구현하세요.
    List<String> strings = getInputStrings();
	
	System.out.println("입력받은 문자열:");
	for(String str : strings) {
		System.out.println(str);
	    }
	
	}
	
	public static List<String> getInputStrings() {  //이해가 안딤 // 질문1 // 공
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int count = 5;
		System.out.println("개의 문자열 입력");
		
		for(int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번째 문자열");
			String input = sc.nextLine();
			list.add(input);
		}
		sc.close();
		return list;
		
		
				

		
		
	}

}
