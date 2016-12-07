package wordcount;

import java.io.FileNotFoundException;

public class Main
{
	public static void main(String[]args) throws FileNotFoundException
	{
		UserIO userIO = new UserIO();
		userIO.startInput();
		fileParse fileparse = new fileParse(userIO.getDateiname());
		System.out.println(fileparse.countWords());
	}
}