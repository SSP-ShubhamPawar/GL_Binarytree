package com.example.main;

import java.util.*;

public class BalancedBracket {
	
	public static void main(String args[])
	{
		String input = null;
		String temp =null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bracket String");
		
			input = sc.next();
			System.out.println("input = " +input);

		Stack s = new Stack();
		System.out.println("Stack = " +s);

	for(int i = 0;i<input.length();i++)
	{
		/*
		 * String in = (String) s.peek(); System.out.println("Stack = " +s.peek());
		 */
		 temp = ""+input.charAt(i);

		if(s.empty())
		{
			s.push(temp);
			System.out.println("s = " +s);

		}
		else if(((String) s.peek()).equalsIgnoreCase("{") && temp.equalsIgnoreCase("}")) 
		{
			s.pop();
			System.out.println("S = " +s);

		}
		else if(((String) s.peek()).equalsIgnoreCase("[") && temp.equalsIgnoreCase("]"))
		{
			s.pop();
		System.out.println("S = " +s);
		}
		else if(((String) s.peek()).equalsIgnoreCase("(") && temp.equalsIgnoreCase(")"))
		{
			s.pop();
		System.out.println("S = " +s);
		}
		else 
		{
			s.push(temp);
			System.out.println("s = " +s);
		}
		
		
	}
	if(s.empty())
	{
		System.out.println("Balanced Bracket");
	}
	else 
	{
		System.out.println("Not Balanced Bracket");
	}
	
	
	}
	

}
