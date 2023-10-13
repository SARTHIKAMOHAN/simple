package Program1;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0,c=0;
		try {
			int arr[] = null;
			System.out.println(arr[1]);
			c=a/b;//throw
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception has occured");
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException has occured");
		}
		catch(Exception e) {
			System.out.println("error occured");
		}
		finally {
			System.out.println("This gets printed no matter what");
		}
		System.out.println(c);
		System.out.println("end of program");
		

	}

}
