package Challenges;

//Building a Smart IDE: Identifying comments

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine())
		{
			String currLine = sc.nextLine();
			if(currLine.contains("//"))
			{
				System.out.println(currLine.substring(currLine.indexOf("//")));
			}
			else if(currLine.contains("/*"))
			{
				int idxStart = currLine.indexOf("/*");
				if(currLine.contains("*/"))
				{
					int idxEnd = currLine.indexOf("*/")+2;
					System.out.println(currLine.substring(idxStart,idxEnd));
				}
				else
				{
					while(sc.hasNextLine())
					{
						while(!currLine.contains("*/"))
						{
							System.out.println(currLine);
							currLine = sc.nextLine();
						}
						System.out.println(currLine.substring(0,currLine.indexOf("*/")+2));
						break;
					}
				}
			}
		}
	}
}