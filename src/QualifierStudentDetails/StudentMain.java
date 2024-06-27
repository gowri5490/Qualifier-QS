package QualifierStudentDetails;
import java.util.*;
public class StudentMain {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Student's Id:");
		int stu_id=input.nextInt();
		
		System.out.println("Enter Student's Name:");
		String stu_name=input.next();
		
		System.out.println("Enter Student's Address:");
		String stu_address=input.next();
		
		boolean isNIT=false;
		String collegeName="";
		
		while(true)
		{
			System.out.println("Wheather the student is from NIT(Yes/No):");
			
			String yesNo=input.next();
			
			yesNo=yesNo.toUpperCase();
			
			if(yesNo.equals("YES"))
			{
				isNIT=true;
				break;
			}
			else if(yesNo.equals("NO"))
			{
				System.out.println("Enter the college name:");
				collegeName=input.nextLine();
				
				break;
			}
		}
		
		Student student;
		
		if(isNIT)
		{
			student=new Student(stu_id,stu_name,stu_address);
		}
		else
		{
			student=new Student(stu_id,stu_name,stu_address,collegeName);
		}
		System.out.println(student.toString()+student.getCollegeName());
	}

}
