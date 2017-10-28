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
			System.out.println("please enter cgpa of student");
			in.givestudentscgpa(count,input.nextDouble());
			count=count+1;
			System.out.print("do you want to proceed 1/0");
			proceed=input.nextInt();
			//System.out.print(proceed);
		}while(proceed==1);
		FileOutputStream fis=new FileOutputStream("Students_list.txt");
		ObjectOutputStream ois=new ObjectOutputStream(fis);
		ois.writeObject(in);
		System.out.println();
		System.out.println("please enter your mode of login\n1.Student\n2.Faculty\n3.Parent\n4.Counsellor");
	
		int type=input.nextInt();

		if(type==1){
		//	Student s=new Student(in);


		}
		else if(type==2){

		}
		else if(type==3){

		}
		else if(type==4){

		}
		else{

		}
	}
}