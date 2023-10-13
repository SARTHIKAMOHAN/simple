package Program1;

class initial
{
	double pi =3.14;
}
class second extends initial
{
    double d=22*pi;
	void display()
	{
		System.out.println(d);
	}
}
class third extends initial
{
	double d =55+pi;
	void dis()
	{
		System.out.println(d);
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		second s=new second();
		s.display();
		third t=new third();
		t.dis();

}
}
