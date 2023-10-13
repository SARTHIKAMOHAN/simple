package Program1;

class person
{
	private String name;	

public String getName()
{
	return name;
}
public void setName(String newName)
{
	this.name=newName;
}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person();
		p.setName("sarthika");
		System.out.println("Name:"+p.getName());

	}

}

