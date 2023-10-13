package Program1;
class demo{
	void display(int a)
	{
		System.out.println(a);
	}
	void display(double a)
	{
		System.out.println(a);
	}
	void display(char ch)
	{
		System.out.println(ch);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     demo d =new demo();
     d.display(4);
     d.display(4.5);
     d.display('h');
	}

}
