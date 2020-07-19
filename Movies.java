import java.util.Scanner;

public class Movies {
	static int tcount=100;
	private static void seatMalayalam2() {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of seat");
		int seatno=scan.nextInt();
		int count =tcount-seatno;
		if(count>0)
		{
			
			System.out.println("seat booked ");
			System.out.println(" Remaining Seat :"+count );
			tcount=tcount-seatno;
		}
		else
		{
			System.out.println("sorry no seat");
		}
	}

	private static void seatEnglish2() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of seat");
		int seatno=scan.nextInt();
		int count =tcount-seatno;
		if(count>0)
		{
			
			System.out.println("seat booked ");
			System.out.println(" Remaining Seat :"+count );
			tcount=tcount-seatno;
		}
		else
		{
			System.out.println("sorry no seat");
		}
		
	}

	private static void seatMalayalam1() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of seat");
		int seatno=scan.nextInt();
		int count =tcount-seatno;
		if(count>0)
		{
			
			System.out.println("seat booked ");
			System.out.println(" Remaining Seat :"+count );
			tcount=tcount-seatno;
		}
		else
		{
			System.out.println("sorry no seat");
		}
	}

	private static void seatHindi1() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of seat");
		int seatno=scan.nextInt();
		int count =tcount-seatno;
		if(count>0)
		{
		
			System.out.println("seat booked ");
			System.out.println(" Remaining Seat :"+count );
			tcount=tcount-seatno;
		}
		else
		{
			System.out.println("sorry no seat");
		}
	}

	public static void main(String[] args) // main block
	{
		System.out.println("................................ MOVIE APP..............................");
		int choice;
		do
		{
			System.out.println("select the city ");
			System.out.println("1.Thrissur \t2.Ernakulam  \t3.exit ");
			Scanner scan=new Scanner(System.in);
			 choice =scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("select the movie");
				System.out.println("1.Hindi \t2.Malayalam\n ");
				Scanner s=new Scanner(System.in);
				int x =scan.nextInt();
				if(x==1)
				{
					seatHindi1();
				}
				else if(x==2) 
				{
					seatMalayalam1();
				}
				else
				{
					System.out.println("enter the correct choice");
				}
				break;
			case 2:
				System.out.println("select the movie");
				System.out.println("1.english \t2.Malayalam  \n ");
				Scanner s1=new Scanner(System.in);
				int y =scan.nextInt();
				if(y==1)
				{
					seatEnglish2();
				}
				else if(y==2)
				{
					seatMalayalam2();
				}
				else
				{
					System.out.println("enter the correct choice");
				}
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("wrong iteam selected");
				break;
			}
		}while(choice!=3);
	 
	  
	}

}