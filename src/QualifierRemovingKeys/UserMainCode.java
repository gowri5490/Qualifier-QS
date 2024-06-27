package QualifierRemovingKeys;
import java.util.HashMap;
import java.util.Iterator;
public class UserMainCode {
	public static int sizeOfResultantHashMap(HashMap<Integer,String>remkey)
	{
		int count=0;
		Iterator<Integer>iterat=remkey.keySet().iterator();
		while(iterat.hasNext())
		{
			int n=iterat.next();
			if(n%4!=0)
			{
				count++;
			}
		}
		return count;
	}

}
