package QualifierZMovies;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieMain {
	private Map<String,Float> movieDetailsMap=new HashMap<>();
	
	public Map<String,Float> getMovieDetailsMap()
	{
		return movieDetailsMap;
	}
	public void setMovieDetailsMap(Map<String,Float> movieDetailsMap)
	{
		this.movieDetailsMap=movieDetailsMap;
	}
	
	public float findMovieRating(String movieName)
	{
		float res=0.0f;
		for(Map.Entry<String,Float>entry:movieDetailsMap.entrySet())
		{
			if(movieDetailsMap.containsKey(movieName))
			{
				res=movieDetailsMap.get(movieName);
			}
		}
		if(res==0.0)
		{
			return -1;
		}
		else
		{
			return res;
		}
	}
	
	public List<String> findMoviesWithHighestRating()
	{
		List <String>ans=new ArrayList<>();
		for(Map.Entry<String,Float>entry:movieDetailsMap.entrySet())
		{
			if(entry.getValue()>4.0)
			{
				ans.add(entry.getKey());
			}
		}
		return ans;
	}
	
	public static void main(String args[])
	{
		MovieMain mm=new MovieMain();
		
		List<String>l1=new ArrayList<>();
		Map<String,Float> map=new HashMap<>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of records to be added:");
		
		int n=sc.nextInt();
		
		System.out.println("Enter the Movie records(Movie Name: Rating)");
		
		String[] input=new String[n];
		sc.nextLine();
		
		for(int i=0;i<n;i++)
		{
			input[i]=sc.nextLine();
		}
		
		for(int i=0;i<input.length;i++)
		{
			String[] split=input[i].split(":");
			
			map.put(split[0], Float.parseFloat(split[1]));
			
			mm.setMovieDetailsMap(map);
		}
		
		System.out.println("Enter movie name needs to be searched");
		
		String search=sc.nextLine();
		
		float resu=mm.findMovieRating(search);
		
		if(resu==-1)
		{
			System.out.println(search+" is an invalid movie name");
		}
		else
		{
			System.out.println(resu);
		}
		
		l1=mm.findMoviesWithHighestRating();
		if(l1!=null && l1.size()>=1)
		{
		System.out.println("The names of the movies with the highest rating are:");
		
		for(String ss:l1)
		{
			System.out.println(ss);
		}
		}
		else
		{
			System.out.println("No movies were found with highest rating");
		}
	}

}
