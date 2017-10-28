import java.io.*;
import java.util.*;
class Counsler{
	int count;
	FileInputStream fis;
	ObjectInputStream ois;
	FacultyJava fj;
	FacultyDsa fd;
	FacultyDc fc;
	Input in;
	HashMap<Integer,Double> students_cgpa;
		Counsler(){
			count=1;
			students_cgpa=new HashMap<Integer,Double>();
			fj=new FacultyJava();
			fd=new FacultyDsa();
			fc=new FacultyDc();
		}
	protected void calculatecgpa(){
		try{
		 fis=new FileInputStream("java.txt");
		 ois=new ObjectInputStream(fis);
	 fj= (FacultyJava)ois.readObject();
		fis=new FileInputStream("Dsa.txt");
		 ois=new ObjectInputStream(fis);
	 fd=(FacultyDsa)ois.readObject();
		 fis=new FileInputStream("Dc.txt");
		 ois=new ObjectInputStream(fis);
	 fc=(FacultyDc)ois.readObject();
		while(count<6){
		int java=fj.students_marks.get(count);
		int dsa=fd.	students_marks.get(count);
		int dc=fc.students_marks.get(count);
		double total=(double)(java+dc+dsa)/30;
			students_cgpa.put(count,total);
		}
	}catch(Exception e){

	}
}
	public void annualcardofstudent(int count){
		try{
		fis=new FileInputStream("Students_list.txt");
		ois=new ObjectInputStream(fis);
		in=(Input)ois.readObject();
		}catch(Exception e){

		}
			System.out.println("name= "+in.students_list.get(count));
			System.out.println("In periodical 1 ");
			System.out.println("java="+fj.students_periodical1.get(count)+"  Dsa="+fd.students_periodical1.get(count)+"  Dc="+fc.students_periodical1.get(count));
			System.out.println("In Periodical 2");
			System.out.println("java="+fj.students_periodical2.get(count)+"  Dsa="+fd.students_periodical2.get(count)+"  Dc="+fc.students_periodical2.get(count));
			System.out.println("Behavior");
			System.out.println("java="+fj.students_behavior.get(count)+"  Dsa="+fd.students_behavior.get(count)+"  Dc="+fc.students_behavior.get(count));
			System.out.println("java="+fj.students_performance.get(count)+"  Dsa="+fd.students_performance.get(count)+"  Dc="+fc.students_performance.get(count));
	}
	public double studentscgpa(int rollnumber){
			return students_cgpa.get(rollnumber);
	}
}