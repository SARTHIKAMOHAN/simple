package Program1;
class Book extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("UpdatingDb");
			try{Thread.sleep(8000);} catch(InterruptedException e) {}
		}
	}
}
class Num{
	void print() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
}
public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book();
		Num n=new Num();
        b.start(); //run
        n.print();
	}

}
