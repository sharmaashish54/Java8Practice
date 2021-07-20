package java8.practice.lambda;

public class LambdaExample3 {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t = new Thread(r);
		t.setName("Thread");
		t.start();
		
		Runnable r2 = ()->{ for(int j=0;j<=10;j++) {
			System.out.println(j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}};
		
		Thread t2 = new Thread(r2);
		t2.start();

	}

}
