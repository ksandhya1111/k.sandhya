import java.util.Date;

/**
 * Class that stores information about the concrete student
 *
 * DO NOT REMOVE given methods, but you can add new methods/fields/constructor
 * and change the given methods implementation. For example you can change implementation for equals()
 * or hashCode() method
 *
 */
public class Student implements Comparable {

	/**
	 * student id
	 */
	private int id;
	//system.out.println("enter number of students you want:");
	//scanner n=new scanner();
	//for(i=1;i<=n;i++)
	System.out.println("enter your id");
	Scanner sc=new Scanner(System.in);
	id=nextInt()
	System.out.println(your id is"+id);
	/**
	 * student name and surname separated by the whitespace for example:
	 * fullName = "David Luis";
	 */
	private String fullName;
	System.out.println("Enter your fullname: ");
Scanner s = new Scanner(System.in);
fullname = s.nextLine();
System.out.println("Your fullname is " + fullname);


	/**
	 * student date of birth in "yyyy-MM-dd" format
	 */
	private Date birthDate
	System.out.println("enter your date of birth in yyyy-mm-date format");
    scanner birthDate=new Scanner(System.in)
	/**
	 * student average mark
	 */
	private double avgMark;
	double s1,s2,s3,totalmarks;
	System.out.println("enter marks of subject s1")
	scanner s1=new Scanner();
		System.out.println("enter marks of subject s2")
	scanner s2=new Scanner();
		System.out.println("enter marks of subject s3")
	scanner s3=new Scanner();
	totalmarks=s1+s2+s3
	avgMarks=total/3;




	public Student(int id, String fullName, Date birthDate, double avgMark) {
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.avgMark = avgMark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getAvgMark() {
		return avgMark;
	}

	public void setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}


	/**
	 * DO NOT change this method it will be used during the task check
	 */
	@Override
	public int compareTo(Object o) {
		Student other = (Student) o;
		return (this.fullName.compareTo(other.fullName));
	}
}
