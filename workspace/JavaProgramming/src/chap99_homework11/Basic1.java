package chap99_homework11;

public class Basic1 {

public static void main(String[] args) {
	for(int i = 1; i <= 20; i++) {
		if(i % 3 == 0 && i % 4 == 0) {
			System.out.println(i);
		}
	}
}
Thread thread = new Thread(new Runnable() {
	@Override
	public void run() {
		for(int i = 1; i <= 20; i++) {
			if(30 % i == 0) {
				System.out.println(i);
			}
		}
			
		
	}

}



}
