class Counsellor{
	int count;
	HashMap<Integer,Double> students_cgpa;
		Counsellor(){
			count=1;
			students_cgpa=new HashMap<Integer,Double>();
		}
	protected void calculatecgpa(){
		FacultyJava fj=new FacultyJava();
		FacultyDsa fd=new FacultyDsa();
		FacultyDc fc =new FacultyDc();
		while(count<6){
		int java=fj.students_marks.get(count);
		int dsa=fd.	students_marks.get(count);
		int dc=fc.students_marks.get(count);
		double total=(double)(java+dc+dsa)/30
			students_cgpa.put(count,total);
		}
	}
	public void annualcardofstudent(int count){
		Input Id=new Input();
		FacultyJava fj=new FacultyJava();
		FacultyDsa fd=new FacultyDsa();
		FacultyDc fc =new FacultyDc();
			System.out.println(In.students_list.get(count));
			System.out.println("In periodical 1 ");
			System.out.println("java="+fj.students_periodical1.get(count)+"  Dsa="+f.students_periodical1.get(count)+"  Dc="+fc.students_periodical1.get(count));
			System.out.println("In Periodical 2");
			System.out.println("java="+fj.students_periodical2.get(count)+"  Dsa="+f.students_periodical2.get(count)+"  Dc="+fc.students_periodical2.get(count));
			System.out.println("Behavior");
			System.out.println("java="+fj.students_behavior.get(count)+"  Dsa="+f.students_behavior.get(count)+"  Dc="+fc.students_behavior.get(count));
			System.out.println("java="+fj.students_performance.get(count)+"  Dsa="+f.students_performance.get(count)+"  Dc="+fc.students_performance.get(count));
	}
}