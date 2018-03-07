package pack;

import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) 
	{
		String s = "Hello <<username>>, How are you ?";
		String inputstring = null;
		System.out.println("Enter the username to be replaced");
		Scanner sc = new Scanner(System.in);
		inputstring = sc.nextLine();
		int n = inputstring.length();
        if(n>=3)
        {
        	System.out.println(s.replace("<<username>>", inputstring));
        }
        else
        {
        	System.out.println("Please enter proper input");
        }
	}

}
