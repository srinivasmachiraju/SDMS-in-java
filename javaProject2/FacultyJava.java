class FacultyJava implements Serializable{
		HashMap<Integer,Integer> students_attendance;
		HashMap<Integer,Integer> students_marks;
		HashMap<Integer,Strings> students_performance;
		HashMap<Integer,Strings> students_behavior;
		HashMap<Integer,Integer> students_periodical1;
		HashMap<Integer,Integer>  students_periodical2;
	FacultyJava{
		students_attendance=new HashMap<Integer,Integer>();
		students_marks=new HashMap<Integer,Integer>();
		students_performance=new HashMap<Integer,String>();
		students_behavior=new HashMap<Integer,String>();
		students_periodical1=new HashMap<Integer,Integer>();
		students_periodical2=new HashMap<Integer,Integer>();
	}
	protected void inputstudentsmarks(int number,int attendance){
			students_attendance.put(number,attendance);
	}

	protected void inputstudentsperformance(int number,String performance){
			students_performance.put(number,performance);
	}
	protected void inputstudentsbehavior(int number,String behaviour){
			students_behavior.put(number,behaviour);
	}
	protected void inputperiodical1marks(int number,int p1){
			students_periodical1.put(number,p1);
	}
	protected void inputperiodical2marks(int number,int p2){
			students_periodical2.put(number,p2);
	}
	protected void inputstudentsattendance(int number,int marks){
			marks=(int)marks/2;
			int p1=students_periodical1.get(number);
			int p2=students_periodical2.get(number);
			int in=p1+p2;
			marks=marks+in;
			students_marks.put(number,marks);
	}
	protected void modifyattendance(int number,int attendance){
			students_attendance.remove(number);
			students_attendance.put(number,attendance);
	}
	protected void modifyperformance(int number,String performance){
			students_at.remove(number);
			students_attendance.put(number,performance);
	}
	protected void modifybehavior(int number,String behaviour){
			students_attendance.remove(number);
			students_attendance.put(number,behaviour);
	}
}