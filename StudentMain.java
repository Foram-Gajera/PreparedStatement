package in.ac.adit.ajt.prepare;
import java.sql.SQLException;

public class StudentMain {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			Student student=new Student();
			StudentDAOImpl student1=new StudentDAOImpl();
		//	student1.addStudent(student);
		//	student1.getStudent("160010116015");
		//	student1.updateStudent(student);
		//	student1.deleteStudent(student);
			System.out.println(student1.getAllStudent());
		}
}
