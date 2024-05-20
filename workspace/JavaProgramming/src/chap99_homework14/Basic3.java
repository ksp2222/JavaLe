package chap99_homework14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 10개 입력: ");
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번째 문자열: ");
			String input = sc.nextLine();
			stringList.add(input);
		}
		
		System.out.println("영문자가 포함된 문자열: ");
		stringList.stream()
		          .filter(s -> s.matches(".*[a-zA-Z]+.*"))
		          .forEach(System.out::println);
		
		sc.close();
		
	}

}