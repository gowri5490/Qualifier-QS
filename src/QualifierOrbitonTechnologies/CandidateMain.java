package QualifierOrbitonTechnologies;

import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class CandidateMain {
	
	private Map<String, Double> candidateMap;

	public Map<String, Double> getCandidateMap() {
		return candidateMap;
	}

	public void setCandidateMap(Map<String, Double> candidateMap) {
		this.candidateMap = candidateMap;
	}




	public double findCandidateMark(String candidateId)
	{
	   
	    // Fill the code here
	Double markScored = candidateMap.get(candidateId);
        if (markScored == null) {
            return -1.0;
        } else {
            return markScored;
        }

	}
	public int findCountOfCandidatesShortlisted()
	{
	    
	
		// Fill the code here
		int count = 0;
        for (Double markScored : candidateMap.values()) {
            if (markScored >= 70.0) {
                count++;
            }
        }
        return count;
			
		
	}

	public List<String> findCandidatesShortlistedForFinalInterview()
	{
			// Fill the code here
			
			List<String> finalInterviewList = new ArrayList<String>();
        for (Map.Entry<String, Double> entry : candidateMap.entrySet()) {
            if (entry.getValue() >= 90.0) {
                finalInterviewList.add(entry.getKey());
            }
        }
        return finalInterviewList;
	}
	
	

	public static void main(String args[])
	{
	   // You are provided with the main method as code template and it is excluded from evaluation.
	    CandidateMain candidate=new CandidateMain();
		List<String> list1=new ArrayList<String>();
		Map<String, Double> map=new HashMap<String,Double>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of records to be added:");
		int n=sc.nextInt();
		System.out.println("Enter the candidate records (candidateId : markScored): ");
		String [] canDetails = new String[n];
		for(int i=0;i<n;i++) {
			canDetails[i] = sc.next();
		}
		
		for(int i=0;i<canDetails.length;i++) {
			String[] a = canDetails[i].split(":");
			
			map.put(a[0], Double.parseDouble(a[1]));
			
			candidate.setCandidateMap(map);
		}
		System.out.println("Enter the candidate id to be searched");
		String search=sc.next();
		double mark=candidate.findCandidateMark(search);
		if(mark!=-1)
		{
		System.out.println(mark);
		}
		else
		{
			System.out.println(search+" is an invalid candidate id");
		}
		int count=candidate.findCountOfCandidatesShortlisted();
		System.out.println("Number of candidates shortlisted for further interview process:");
		System.out.println(count);
		list1=candidate.findCandidatesShortlistedForFinalInterview();
		
			System.out.println("Candidate id of the candidates shortlisted to directly attend the final interview:"); 
			for(String s:list1)
			{
				System.out.println(s);
			}
	}
	
}
 

 

 

 

 

