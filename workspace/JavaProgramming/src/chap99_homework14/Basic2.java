package chap99_homework14;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();

        System.out.println("문자열을 10개 입력:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "번째 문자열: ");
            String input = scanner.nextLine();
            stringList.add(input);
        }

        System.out.println("길이가 5 이상인 문자열:");
        stringList.stream()
                  .filter(s -> s.length() >= 5)
                  .forEach(System.out::println);

        scanner.close();
    }
}
