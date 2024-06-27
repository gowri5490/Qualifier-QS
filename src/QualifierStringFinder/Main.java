package QualifierStringFinder;
import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the SearchString:");
		String searchString=sc.next();
		
		System.out.println("Enter Str1:");
		String str1=sc.next();
		
		System.out.println("Enter Str2:");
		String str2=sc.next();
		
		int result=UserMainCode.stringFinder(searchString, str1, str2);
		
		if(result ==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
