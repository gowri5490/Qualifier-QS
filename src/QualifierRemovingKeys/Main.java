package QualifierRemovingKeys;
import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		
		HashMap<Integer,String> remkey=new HashMap<Integer,String>();
		for(int i=0;i<input;i++)
		{
			remkey.put((sc.nextInt()),(sc.next()));
			
		}
		System.out.println(UserMainCode.sizeOfResultantHashMap(remkey));
		sc.close();
	}

}
