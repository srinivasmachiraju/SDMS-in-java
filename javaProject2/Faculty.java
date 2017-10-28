import java.util.*;
import java.io.*;
class Faculty{
	Scanner s;
	Faculty(){
	s=new Scanner(System.in);
	}
	public void choose(int n){
		if (n==1){
				int count=1;
				FacultyJava fj=new FacultyJava();
				while(count<6){
						System.out.println("enter th details of student of number"+count);
						System.out.println("enter attendance");
						fj.inputstudentsattendance(count,s.nextInt());
						System.out.println("enter periodical1 marks");
						fj.inputperiodical1marks(count,s.nextInt());
						System.out.println("enter periodical2 marks ");
						fj.inputperiodical2marks(count,s.nextInt());
						System.out.print("input behavior");
						fj.inputstudentsbehavior(count,s.next());
						System.out.print("input performance");
						fj.inputstudentsperformance(count,s.next());
						System.out.println("input end sem marks");
						fj.inputstudentsmarks(count,s.nextInt());
						count=count+1;
				}

			try{
				FileOutputStream fos=new FileOutputStream("java.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(fj);
			}catch(Exception e){

			}

		}
		if (n==2){
			int count=1;
				FacultyDsa fd=new FacultyDsa();
				while(count<6){
						System.out.println("enter attendance");
						fd.inputstudentsattendance(count,s.nextInt());
						System.out.println("enter periodical1 marks");
						fd.inputperiodical1marks(count,s.nextInt());
						System.out.println("enter periodical2 marks ");
						fd.inputperiodical2marks(count,s.nextInt());
						System.out.print("input behavior");
						fd.inputstudentsbehavior(count,s.next());
						System.out.print("input performance");
						fd.inputstudentsperformance(count,s.next());
						System.out.println("input end sem marks");
						fd.inputstudentsmarks(count,s.nextInt());
						count=count+1;
				}

			try{
				FileOutputStream fos=new FileOutputStream("Dsa.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(fd);
			}catch(Exception e){
				
			}

		}
		if(n==3){
				int count=1;
				FacultyDc fc=new FacultyDc();
				while(count<6){
						System.out.println("enter attendance");
						fc.inputstudentsattendance(count,s.nextInt());
						System.out.println("enter periodical1 marks");
						fc.inputperiodical1marks(count,s.nextInt());
						System.out.println("enter periodical2 marks ");
						fc.inputperiodical2marks(count,s.nextInt());
						System.out.print("input behavior");
						fc.inputstudentsbehavior(count,s.next());
						System.out.print("input performance");
						fc.inputstudentsperformance(count,s.next());
						System.out.println("input end sem marks");
						fc.inputstudentsmarks(count,s.nextInt());
						count=count+1;
				}

			try{
				FileOutputStream fos=new FileOutputStream("Dc.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(fc);
			}catch(Exception e){
				
			}
		}
	}
}