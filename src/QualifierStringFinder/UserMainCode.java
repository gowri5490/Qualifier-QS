package QualifierStringFinder;

public class UserMainCode {
	
	public static int stringFinder(String str_search,String str1,String str2)
	{
		int indexStr1=str_search.indexOf(str1);
		int indexStr2=str_search.indexOf(str2);
		if(indexStr1!=-1 && indexStr2!=-1 && indexStr2>indexStr1)
		{
			return 1;
		}
		else 
			return 2;
	}

}
