package Program1;
interface firstt{
	int a=5;
}
class secondd{
	int b=7;
}
class finall extends secondd implements firstt
{
	int c=a*b;
	void display()
	{
		System.out.println(c);
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finall f=new finall();
		f.display();

	}

}
