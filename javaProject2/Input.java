import java.util.*;
import java.io.*;
class Input implements Serializable{
	HashMap<Integer,String> students_list;
	HashMap<Integer,Integer> students_attendance;
	HashMap<Integer,Double> students_cgpa;
	
	Input(){
		students_list=new HashMap<Integer,String>();
		students_attendance=new HashMap<Integer,Integer>();
		 students_cgpa=new HashMap<Integer,Double>();
		}
	public void givestudentsdetails(int number,String name){
		
			students_list.put(number,name);
		
		}
		/*public void givestudentsattendance(int number,int attendance){
				students_attendance.put(number,attendance);
		}*/
		public void givestudentscgpa(int number,double cgpa){
				students_cgpa.put(number,cgpa);
		}
	}