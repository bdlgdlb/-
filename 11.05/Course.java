/**************************************
*               Course                *
*-------------------------------------*
* -courseName: String                 *
* -students: ArrayList<String>        *
*-------------------------------------*
* +Course(courseName: String)		  *
* +addStudent(student: String): void  *
* +getStudents(): String[]            *
* +getNumberOfStudents(): int         *
* +getCourseName(): String 			  *
* +dropStudent(student: String): void *
* +clear():void                       *                
**************************************/
import java.util.ArrayList;
public class Course{
	private String courseName;
	private ArrayList<String> students;

	public Course(String courseName){
		this.courseName = courseName;
		students = new ArrayList<>();
	}

	public void addStudent(String student){
		students.add(student);
	}

	public String[] getStudents(){
		String[] a = new String[students.size()];
		return students.toArray(a);
	}

	public int getNumberOfStudents(){
		return students.size();
	}

	public String getCourseName(){
		return courseName;
	}

	public void dropStudent(String student){
		students.remove(student);
	}

	public void clear(){
		students.clear();
	}
}