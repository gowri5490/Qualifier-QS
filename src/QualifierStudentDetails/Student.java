package QualifierStudentDetails;
public class Student 
{
    private int studentId;
    private String studentName,studentAddress,collegeName;
    
    public Student(int studentId,String studentName,String studentAddress,String collegeName)
    {
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
        this.collegeName=collegeName;
    }
    public Student(int studentId,String studentName,String studentAddress)
    {
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
        this.collegeName="NIT";
    }
    
	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public String getCollegeName() {
		return collegeName;
	}
	public String toString()
	{
		return "Student id:"+studentId+"\n"+"Student name:"+studentName+"\n"+"Address:"+studentAddress+"\n"+"College name:";
	}

    
}
