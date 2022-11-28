import java.util.Scanner;
class fact
{
	public static void main(String args[])
	{
		int n,i,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		n=s.nextInt();
		for(i=n;i>=1;i--)
		{
			fact=fact* i;
	    }
	    System.out.println("factorial result="+fact);

	}
}
