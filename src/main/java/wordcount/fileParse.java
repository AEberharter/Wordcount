package wordcount;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileParse{
	
	File file;
	String filename;
	
	
	public fileParse(String filename)
	{
		file = new File(filename);
	}
	
	public int countWords() throws FileNotFoundException
	{
		try(Scanner sc = new Scanner(new FileInputStream(file))){
		    int count=0;
		    while(sc.hasNext()){
		    	String word=sc.next(); 
		    	if(word.indexOf("\\")==-1) 
		    		count++;
		    }
		return count;
		}
	}	
}
