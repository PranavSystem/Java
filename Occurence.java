package practice.java;

import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the line:");
		String str=sc.nextLine();
		System.out.println("Enter character:");
		char c=sc.next().charAt(0);
		int count=0;
		int j=0;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)==c)
			{
				count++;
				if(count==2)
				{
					System.out.println(i+1);
					break;
				}			
			}			
		}
		
		if(count==1)
		{
			System.out.println("NO two occurence");			
		}
		
		else
		{
			System.out.println("No such character in string");
		}
		
		
		
		

	}

}
