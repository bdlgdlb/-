public class Exercise11_02{
	public static void main(String[] args) {
		Person person = new Person("John", "12 Bell street", 
			"3473339999", "john12@aol.com");

		Student student = new Student("Mary", "100 Town Ave", "5149993333", 
			"mary100@aol.com", Student.FRESHMAN);

		Employee employee = new Employee("Mike", "34 West street", "6189999999",
			"mike80@aol.com", 910, 60000);

		Faculty faculty = new Faculty("Sue", "28 Well street", "4133333333",
			"sue28@aol.com", 101, 50000, "4pm to 6pm", "Professor");

		Staff staff = new Staff("Tom", "90 Country road", "2030000000",
			"tomcat@aol.com", 12, 65000, "Executive Assistant");

		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}
/*

		Name: John
		Address: 12 Bell street
		Phone number: 3473339999
		Email address: john12@aol.com

		Name: Mary
		Address: 100 Town Ave
		Phone number: 5149993333
		Email address: mary100@aol.com
		Status: freshman

		Name: Mike
		Address: 34 West street
		Phone number: 6189999999
		Email address: mike80@aol.com
		Office: 910
		Salary: $60000.00
		Date hired: 8/26/2017

		Name: Sue
		Address: 28 Well street
		Phone number: 4133333333
		Email address: sue28@aol.com
		Office: 101
		Salary: $50000.00
		Date hired: 8/26/2017
		Office hours: 4pm to 6pm
		Rank: Professor

		Name: Tom
		Address: 90 Country road
		Phone number: 2030000000
		Email address: tomcat@aol.com
		Office: 12
		Salary: $65000.00
		Date hired: 8/26/2017
		Title: Executive Assistant

 */