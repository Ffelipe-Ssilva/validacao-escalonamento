package validacao;

public class DemoThreadScheduling {
	public static void main(String args[]){
		//Ja tentei tirar um dos objetos da thread, mas nao intercala
		//TestThreadScheduling ob2 = new TestThreadScheduling();
		
        Thread ob1 = new Thread(TestThreadScheduling.run());
        Thread ob2 = new Thread(TestThreadScheduling.run());
        Thread ob3 = new Thread(TestThreadScheduling.run());
        System.out.println("Id of ob1 "+ob1.getId());
        System.out.println("Id of ob2 "+ob2.getId());
        
        System.out.println("Name of ob1 "+ob1.getName());
        System.out.println("Name of ob2 "+ob2.getName());
        ob1.setName("Java");
        ob1.setName("Lang");
        ob1.start();
        try {
			ob1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        ob2.start();
        ob3.start();
        System.out.println("Name of ob1 afer mod."+ob1.getName());
        System.out.println("Name of ob2 afer mod."+ob2.getName());
    }
}
