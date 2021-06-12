package validacao;
//pode ignorar esse, achei que colocando outra classe funcionaria
public class TestThreadSchedulingSecond {
	public static Runnable run(){
		int index;
		for (index = 1; index <= 10; index++) {
			System.out.println(index+" Value of "+Thread.currentThread().getId());
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}
