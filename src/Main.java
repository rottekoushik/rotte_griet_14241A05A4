import java.util.*;
import java.io.*;
import java.text.*;
import java.util.Date;
public class Main {
	
	public static void main(String[] args) throws Exception {
		
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit int id, String fullName, Date birthDate, double avgMark
		System.out.println("enter id,fullName,birthDate,avgMark");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String fullName=sc.next();
		Date date = new Date();
		Date birthDate=null;
		try{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		birthDate = formatter.parse(sc.nextLine());
		}
		catch(Exception e)
		{
		}
		double avgMark=sc.nextDouble();
		Student stu=new Student(id,fullName,birthDate,avgMark);
		
		
	}

}
