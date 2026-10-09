package SkillBuilders;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFilep2 {

	public static void main(String[] args) 
	{
		//you cannot use scanner to access files
		File textFile; 
		String Response;
		Scanner input = new Scanner(System.in);
		
		textFile = new File("C:\\Users\\49139005\\git\\CS30P1\\Chaper11\\src\\SkillBuilders\\CS311.txt");
		
		if(textFile.exists())
		{
			System.out.println("Cs311.txt file exists");
		}
		else
		{
			try
			{
				textFile.createNewFile();
				System.out.println("cs311.txt has been created");
			}
			catch(IOException e)
			{
				System.out.println("file could not be created.");
				System.err.println("IOException: " + e.getMessage());
			}
		}
		System.out.println("would you like to (k)eep or (d)elete the file?");
		Response = input.next();
		
		if(Response.equalsIgnoreCase("D"))
		{
			if(textFile.delete())
			{
				System.out.println("file is deleted.");
			}
		}
		else
		{
			System.out.println("file is kept and stays the same.");
		}
	}

}
