package Program1;

class TotalAmount
{
	
	int TotalBalance=1500;
}
class credited extends TotalAmount
{
	
	int CreditAmount=1000;
	int AfterCredit=TotalBalance+CreditAmount;
	public void display1()
	{
	System.out.println(TotalBalance);
	System.out.println("After Credited " +CreditAmount+ " TotalBalance:" +AfterCredit);
}
	
}
class Debit extends credited
{
	public void display2(int DebitAmount)
	{  
		int Balance=AfterCredit-DebitAmount;
		System.out.println("After Debited " +DebitAmount+ " TotalBalance:"+Balance);
	}
}
	
public class MultiLevelnheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
     credited c=new credited();
     c.display1();
     Debit d=new Debit();
     d.display2(1500);
	}

}

