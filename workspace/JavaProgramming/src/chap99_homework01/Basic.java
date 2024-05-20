package chap99_homework01;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. int num = 10;을 선언하고 증감연산자를 통해 다음과 같이 출력하세요. 출력된 값은 모두 증감연산자가 포함된 상태입니다.
		//11
		//12
		//12
		//10
		//10
		// 8	

		int num = 10;
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(num--);
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(--num);
		System.out.println("-------------------------------------");
	
//      2. 관계연산자(<, >) 두 개를 사용하여 int a = 10; int b = 20; 의 관계를 다음과 같이 출력하세요.
//      true
//      false
		int a = 10;
		int b = 20;
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println("-------------------------------------");

//      3. 10 ~ 1까지 거꾸로 while문으로 출력
		int i = 10;
			while(i > 0) {
				System.out.println(i);
				i--;
			}
		System.out.println("-------------------------------------");
			
//		4. 10 ~ 1까지 거꾸로 do ~ while문으로 출력
		int w = 10;
		do {w--;
		System.out.println(w);		
		}while(w > 0);
		System.out.println("-------------------------------------");
		
//		5. 10 ~ 1까지 거꾸로 for문으로 출력
		for(int e = 10; e < 0; e--) {
		System.out.println(e);
		System.out.println("-------------------------------------");	  
		}
		
//		6. 1 ~ 100까지 합을 while문으로 출력
		int sum = 0;
		int r = 1;
		while(r <= 100) {
			sum += r;
			r++;
		}
		System.out.println(sum);
		System.out.println("-------------------------------------");

//      7. 1 ~ 100까지 합을 do ~ while문으로 출력
        int sum1 = 0;
        int t = 1;
        do {sum1 += t;
        t++;
        System.out.println(sum1);
        } while(t <= 100);
        
//      8. 1 ~ 100까지 합을 for문으로 출력
        int sum2 = 0;
        for(int y = 1; y <= 100; y++) {
        	sum2 += y;
        }
        System.out.println(sum2);
		System.out.println("-------------------------------------");
		
//		9. int 10개짜리 배열 생성하여
//		 int배열에 3의 배수를 차례대로 저장하세요.
//		 그리고 거꾸로 출력하세요.
		int[] arr = new int[10];
		for(int s = 0; arr.length > 10; s++);

		


   }
}
