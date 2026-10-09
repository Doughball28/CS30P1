package SkillBuilders;

import java.io.*;
import java.util.Scanner;

public class MyFilep1 {


	public static void main(String[] args) 
	{
		File textFile; 
		String fileName;
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter file name:");
		fileName = input.next();
		
		textFile = new File(fileName);
		
		if(textFile.exists())
		{
			System.out.println("file exists.");
			
		}
		else
		{
			System.out.println("file does not exist.");
		}
	}

}
