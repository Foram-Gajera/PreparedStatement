package in.ac.adit.ajt.prepare;

import java.util.List;
import java.util.ArrayList;

public interface StudentDAO {
	final String DRIVER="com.mysql.jdbc.Driver";
	final String URL="jdbc:mysql://localhost:3306/college_mgt";
	final String DBUSER="root";
	final String DBPASSWORD="";
	
	public Boolean addStudent(Student student);
	public Student getStudent(String StudentId);
	public Boolean updateStudent(Student student);
	public Boolean deleteStudent(Student student);
	public List<Student> getAllStudent();

}
