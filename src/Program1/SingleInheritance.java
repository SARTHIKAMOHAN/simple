package Program1;

class a
{
	int a=10;
}
class b extends a
{
	void display()
	{
	int b=20;
	int c=a*b;
	System.out.println(c);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b obj=new b();
		obj.display();
				

	}

}
