import java.io.*;
import java.util.*;
class Login{
	public static void main(String [] args) throws IOException{
			Scanner input=new Scanner(System.in);
		System.out.println("welcome to amrita student diary\n");

		System.out.println("before proceeding please full the minimum data\n");
		int proceed;
		int count=1;
		Input in = new Input();

		do{
			System.out.println("please enter students  name in roll no order");
			//int number=input.nextInt();
			in.givestudentsdetails(count,input.next());
			//System.out.println("please enter students attendance");
			//in.givestudentsattendance(count,input.nextInt());
			//System.out.println("please enter cgpa of student");
			//in.givestudentscgpa(count,input.nextDouble());

			count=count+1;
			//System.out.print(proceed);
		}while(count<6);
		FileOutputStream fis=new FileOutputStream("Students_list.txt");
		ObjectOutputStream ois=new ObjectOutputStream(fis);
		ois.writeObject(in);
		System.out.println();
		System.out.println("please enter your mode of login\n1.Student\n2.Faculty\n3.Parent\n4.Counsellor");
	
		
		int d=1;
		while(d==1){
			int type=input.nextInt();
		if(type==1){
				int z=1;
				while(z==1){
				System.out.println("please enter your roll number");
				int number=input.nextInt();
				Students s=new Students(number);
				System.out.println("1.attendance\n2.p1 marks3.p2 marks\n4. cgpa");
				int choice =input.nextInt();
				if(choice==1){
					s.checkattendence(number);

				}
				else if(choice==2){
					s.checkPeriodical1marks(number);
				}
				else if(choice==3){
					s.checkPeriodical2marks(number);
				}
				else if(choice==4){
					s.checkcgpa(number);
				}
					System.out.println("do you like to change the user type (1/0)");
					z=input.nextInt();
				}
				}
		
		else if(type==2){
				int i=1;
				Faculty fa=new Faculty();

				while(i==1){
						System.out.print("1.java\n2.dsa\n3.dc");
						int cho=input.nextInt();
						fa.choose(cho);
				}
				System.out.println("do you like to change the user type (1/0)");
					i=input.nextInt();

		}
		else if(type==3){
			int b=1;
			Parents pa=new Parents();

			
				System.out.println("enter roll numner");
				int numb=input.nextInt();
				pa.annualreport(numb);
				System.out.println("do you want to change user type (1/0)");
				b=input.nextInt();
			

		}
		else if(type==4){
			Counsler coun=new Counsler();

		}
		
				System.out.println("do you like to quit (1/0)");
				d=input.nextInt();
	}
}
}