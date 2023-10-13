package Program1;
abstract class Sunstar {
    abstract void printInfo();
}
class Employee extends Sunstar {
    void printInfo()
    {
        String name = "Sarthika";
        int age = 21;
        
        System.out.println(name);
        System.out.println(age);
       
    }
}
 
public class Abstract {

	
		// TODO Auto-generated method stub
		public static void main(String args[])
	    {
	        Sunstar s = new Employee();
	        s.printInfo();
	    }
	}		



