package TeamAnonymous;
import java.util.*;
public class CIS {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int b=0,c = 0;
		char a;
		System.out.println("For Start Radar input Y otherwise N");
		a=scan.next().charAt(0);
		if(a=='Y' || a=='y' )
		{
			System.out.println("Radar is Activated & Scanning for Thread.");
			System.out.println("If thread is fouded enter 1 othrwise 0");
			b=scan.nextInt();
			if(b==1)
			{
				System.out.println("Drone is Activated & Going for Final Scanning\n"
						+ "Drone will take photo and san the thread");
				System.out.println("If the thread are not matching with the database enter 1");
				c=scan.nextInt();
				if(c==1)
				{
					System.out.println("If the thread are not matching with the database");
					System.out.println("Sent details to the HeadQuarter Contact with Police");
				}
				else
				{
					System.out.println("This is not criminal");
				}
			}
			else
				System.out.println("Continue Scanning");
		}





	}


}
