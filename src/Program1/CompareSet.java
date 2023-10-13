package Program1;
//Import the HashSet class
import java.util.*;
public class CompareSet {

	public static void main(String[] args) {
		//Creating first hashset 
		  HashSet<String> set1 = new    HashSet<String>();
		    set1.add("aaa");
		    set1.add("bbb");
		    set1.add("ccc");
		    set1.add("vvv");
		    set1.add("eee");
		    System.out.println("Frist HashSet"+ set1);
		    //Creating second hashset 
		  HashSet<String> set2 = new    HashSet<String>();
		    set2.add("aaa");
		    set2.add("bbb");
		    set2.add("ccc");
		    set2.add("vvv");
		    set2.add("eee");
		    System.out.println("Second HashSet"+ set2);
		    //Comparing two hashsets
		    boolean compare = set1.equals(set2);
		    //Displaying the results         
		    if(compare)
		 System.out.println("The two hashsets are equal");
		    else
		    System.out.println("The two hashsets are not equal");
		    
		  }
		}

