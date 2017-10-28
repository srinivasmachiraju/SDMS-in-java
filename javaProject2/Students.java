import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Students {
	Scanner s;
	FileInputStream fis;
	ObjectInputStream ois;
	FacultyJava fj;
	FacultyDsa fd;
	FacultyDc fc;
	Counsler con;
	Students(int rollnumber){
		try{
		fis=new FileInputStream("Students_list.txt");
		 ois=new ObjectInputStream(fis);
		Input ou=(Input)ois.readObject();
		System.out.println("Welcome "+ou.students_list.get(rollnumber));
	}catch(Exception e){

		}
	}

	public void checkattendence(int rollnumber){
			try{
				System.out.println("enter the subject\n1.Java\n2.Dsa\n3.Dc");
				s=new Scanner(System.in);
				int n=s.nextInt();
				if(n==1){
						fis=new FileInputStream("java.txt");
						ois=new ObjectInputStream(fis);
						fj=(FacultyJava)ois.readObject();
						System.out.println(fj.students_attendance.get(rollnumber));
				}
				if(n==2){
					fis=new FileInputStream("Dsa.txt");
						ois=new ObjectInputStream(fis);
						fd=(FacultyDsa)ois.readObject();
						System.out.println(fd.students_attendance.get(rollnumber));

				}
				if(n==3){
					fis=new FileInputStream("Dc.txt");
						ois=new ObjectInputStream(fis);
						fc=(FacultyDc)ois.readObject();
						System.out.println(fc.students_attendance.get(rollnumber));

				}
					}catch(Exception e){

					}
	}
	public void checkPeriodical1marks(int rollnumber){
		try{
		System.out.println("enter the subject\n1.Java\n2.Dsa\n3.Dc");
				s=new Scanner(System.in);
				int n=s.nextInt();
				if(n==1){
						fis=new FileInputStream("java.txt");
						ois=new ObjectInputStream(fis);
						fj=(FacultyJava)ois.readObject();
						System.out.println(fj.students_periodical1.get(rollnumber));
				}
				if(n==2){
					fis=new FileInputStream("Dsa.txt");
						ois=new ObjectInputStream(fis);
						fd=(FacultyDsa)ois.readObject();
						System.out.println(fd.students_periodical1.get(rollnumber));

				}
				if(n==3){
					fis=new FileInputStream("Dc.txt");
						ois=new ObjectInputStream(fis);
						fc=(FacultyDc)ois.readObject();
						System.out.println(fc.students_periodical1.get(rollnumber));

				

	}
}catch(Exception e){

	}
		

}
			public void checkPeriodical2marks(int rollnumber){
		try{
		System.out.println("enter the subject\n1.Java\n2.Dsa\n3.Dc");
				s=new Scanner(System.in);
				int n=s.nextInt();
				if(n==1){
						fis=new FileInputStream("java.txt");
						ois=new ObjectInputStream(fis);
						fj=(FacultyJava)ois.readObject();
						System.out.println(fj.students_periodical2.get(rollnumber));
				}
				if(n==2){
					fis=new FileInputStream("Dsa.txt");
						ois=new ObjectInputStream(fis);
						fd=(FacultyDsa)ois.readObject();
						System.out.println(fd.students_periodical2.get(rollnumber));

				}
				if(n==3){
					fis=new FileInputStream("Dc.txt");
						ois=new ObjectInputStream(fis);
						fc=(FacultyDc)ois.readObject();
						System.out.println(fc.students_periodical2.get(rollnumber));

				

	}
	}catch(Exception e){

	}
		

	}
	public void checkcgpa(int rollnumber){
		try{
		fis=new FileInputStream("cgpa.txt");
		ois=new ObjectInputStream(fis);
		con=(Counsler)ois.readObject();
		double cgpa=con.studentscgpa(rollnumber);
		System.out.println("Cgpa= "+cgpa);
	}catch(Exception e){

	}
	}
}