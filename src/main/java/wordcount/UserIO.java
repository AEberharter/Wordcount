package wordcount;
import java.util.Scanner;

public class UserIO {
	
	String dateiname;
	Scanner scan;
	
	public UserIO()
	{
		scan = new Scanner(System.in);
	}
	
	public void startInput()
	{
		System.out.println("Bitte w�hlen sie den Dateinamen der zu lesenden Datei:");
		dateiname = scan.nextLine();
	}
	
	public String getDateiname()
	{
		return dateiname;
	}

}
