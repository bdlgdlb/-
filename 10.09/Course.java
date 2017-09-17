public class Course{
	private String courseName;
	private String[] students = new String[5];
	private int numberOfStudents;

	public Course(String courseName){
		this.courseName = courseName;
	}

	public void addStudent(String student){
		if(numberOfStudents >= students.length){
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		students[numberOfStudents++] = student;
	}

	public String[] getStudents(){
		return students;
	}

	public int getNumberOfStudents(){
		return numberOfStudents;
	}

	public String getCourseName(){
		return courseName;
	}

	public void dropStudent(String student){
		int i;
		for (i = 0; i < students.length; i++) {
			if (students[i].equals(student)) {
				break;
			}
		}

		while (i < students.length) {
			if(i < students.length - 1){
				students[i] = students[i + 1];
			}
			else{
				students[i] = null;
			}
			i++;
		}

		numberOfStudents--;
	}

	public void clear(){
		students = new String[2];
		numberOfStudents = 0;
	}
}