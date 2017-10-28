class FacultyJava implements Serializable{
		HashMap<Integer,Integer> students_attendance;
		HashMap<Integer,Integer> students_marks;
		HashMap<Integer,Strings> students_performance;
		HashMap<Integer,Strings> students_behavior;
	FacultyJava{
		students_attendance=new HashMap<Integer,Integer>();
		students_marks=new HashMap<Integer,Integer>();
		students_performance=new HashMap<Integer,String>();
		students_behavior=new HashMap<Integer,String>();

	}
	public void inputstudentsmarks(int number,int attendance){
			students_attendance.put(number,attendance);
	}
	public void inputstudentsattendance(int number,int marks){
			students_marks.put(number,marks);
	}
	public void inputstudentsperformance(int number,String performance){
			students_performance.put(number,performance);
	}
	public void inputstudentsbehavior(int number,String behaviour){
			students_behavior.put(number,behaviour);
	}
	protected void modifyattendance(int number,int attendance){
			students_attendance.remove(number);
			students_attendance.put(number,attendance);
	}
	protected void modifymarks(int number,int marks){
			students_marks.remove(number);
			students_marks.put(number,marks);
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