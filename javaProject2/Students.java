import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Students {
	
	Students(Input in){
		try{
		FileInputStream fis=new FileInputStream("Students_list.txt");
		ObjectInputStream oos=new ObjectInputStream(fis);
		Input out=(Input)oos.readObject();
	}catch(Exception e){

		}
	}
	public void checkattendence(int rollnumber){
			
	}
		

}