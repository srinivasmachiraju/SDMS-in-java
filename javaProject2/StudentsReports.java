import java.io.*;
import java.util.*;
class StudentsReports{
	HashMap<Integer,String> reports;
	StudentsReports(){
		reports=new HashMap<Integer,String>();
	}

	public void addreport(int rollnumber,String information){

		reports.put(rollnumber,information);
	}
}