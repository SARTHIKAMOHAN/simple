package Program1;

public class ForEachLoop {
//whenever we does'n know end value at the time we use for each loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60};
		char vowels[]= {'a','e','i','o','u'};
		for(int i:a)
		{
			System.out.println(i);
		}
		for (char ch:vowels)
		{
			System.out.println(ch);
		}

	}

}
