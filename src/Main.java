import java.util.*;
import java.io.*;
import java.util.Date;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit int id, String fullName, Date birthDate, double avgMark
		System.out.println("enter id,fullName,birthDate,avgMark");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String fullName=sc.next();
		Date birthDate=sc.next();

		double avgMark=sc.nextDouble();
		Student stu=new Student(id,fullName,birthDate,avgMark);
		
		
	}

}
