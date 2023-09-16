public class PositiveNegative {
	int i;

public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	for(int i=0;i<1000;i++)
	{
	System.out.println("Enter any number to check whether it is positive or negative");
	int value=s1.nextInt();
	PositiveNegative pn=new PositiveNegative();
	pn.Checking(value);
	}
    }
public int Checking(int ans)
{
	if(ans<0)
	{
		System.out.println("Negative");
	}
	else if(ans>0)
	{
		System.out.println("Positive");
	}
	else
	{
		System.out.println("Its a Zero");
	}
	return ans;
}
     
}
