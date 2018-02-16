import java.util.Scanner;

public class baseball {

	private static String name;
	private static int AB;
	private static int H;
	private static int doubles;
	private static int triples;
	private static int HR;
	private static int R;
	private static int BB;
	
	public static void main(String[] args) {
		SetStats();
		
		System.out.println("Batting Average: " + BA());
		System.out.println("On Base Percentage:  " + OBP());
		System.out.println("Slugging Percentage:  " + SLG());
		System.out.println("On Base + Slugging Percentage:  " + OBS());
		System.out.println("Total Bases:  " + TB());
	}
	
	
	public static void SetStats()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Player's name: ");
		name = input.next();
		System.out.print("Enter Player's At bats: ");
		AB = input.nextInt();
		System.out.print("Enter Player's Hits: ");
		H = input.nextInt();
		System.out.print("Enter Player's Doubles: ");
		doubles = input.nextInt();
		System.out.print("Enter Player's Triples: ");
		triples = input.nextInt();
		System.out.print("Enter Player's Home Runs: ");
		HR = input.nextInt();
		System.out.print("Enter Player's Runs: ");
		R = input.nextInt();
		System.out.print("Enter Player's Walks: ");
		BB = input.nextInt();
	}
	
	public static double BA()
	{
		return (double)H / AB;
	}
	
	public static double OBP()
	{
		return (double)(H + BB)/(BB + AB);
	}
	
	public static double SLG()
	{
		return ((double)H + doubles + (triples * 2) + (HR * 3))/AB;
	}
	
	public static double OBS()
	{
		return (OBP() + SLG());
	}
	
	public static int TB()
	{
		return H + doubles + (triples * 2) + (HR * 3);
	}
}
