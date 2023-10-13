package Program1;
import java.util.ArrayList;
import java.util.Iterator;
public class list {

	public static void main(String[] args) {
		ArrayList<String>Fruits = new ArrayList<String>();
		Fruits.add("Apple");
		Fruits.add("Mango");
		Fruits.add("Guava");
		Fruits.add("Pineapple");
		Fruits.add("Grapes");
		System.out.println(Fruits);
		Iterator<String> i = Fruits.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
		Fruits.remove(2);
		System.out.println(Fruits);
		Fruits.set(2,"Orange");
		System.out.println(Fruits);
		} 
		}

	


