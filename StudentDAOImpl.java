package in.ac.adit.ajt.prepare;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAOImpl implements StudentDAO {

	private Connection connection;
	//private Statement statement
	private PreparedStatement pstmt;
	private ResultSet resultSet;
//	private String query;
//	
	public StudentDAOImpl() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection(URL,DBUSER,DBPASSWORD);
		//statement=connection.createStatement();
		System.out.println("Connected!");
	}
	
	@Override
	public Boolean addStudent(Student student) {
		
		try {
			pstmt = connection.prepareStatement("insert into student values(?,?,?,?)");
			pstmt.setString(1,"160010116015");//1 specifies the first parameter in the query  
			pstmt.setString(2,"Foram");
			pstmt.setString(3,"Gajera");
			pstmt.setInt(4,20);
			pstmt.executeUpdate();
			System.out.println("added!");
			
			  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}  
		
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Student getStudent(String StudentId) {
		// TODO Auto-generated method stub
		
		
		try {
			pstmt = connection.prepareStatement("select * from student where StudentId=?");
			pstmt.setString(1,StudentId);
			resultSet=pstmt.executeQuery();  
			while(resultSet.next()){  
			System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getInt(4));  
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return null;
	}

	@Override
	public Boolean updateStudent(Student student) {
		try {
			pstmt=connection.prepareStatement("update student set FirstName=?,LastName=? where StudentId=?");
			pstmt.setString(1,"Dhara");
			pstmt.setString(2, "Koyani");
			pstmt.setString(3, "160010116015");
			pstmt.executeUpdate();
			System.out.println("updated!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Override
	public Boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			pstmt=connection.prepareStatement("delete from student where StudentId=?");
			pstmt.setString(1,"160010116015");
			pstmt.executeUpdate();
			System.out.println("Deleted!");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> studentList=new ArrayList<Student>();
		
		try {
			pstmt=connection.prepareStatement("select * from student");
			resultSet=pstmt.executeQuery();
			while(resultSet.next()){
				Student student=new Student();
				student.setStudentId(resultSet.getString(1));
				student.setFirstName(resultSet.getString(2));
				student.setLastName(resultSet.getString(3));
				student.setAge(resultSet.getInt(4));
				studentList.add(student);
			} 
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return null;
		}
		return studentList;
	}
}
//	public ArrayList<Student> getAllStudent() {
//		// TODO Auto-generated method stub
//		ArrayList<Student> studentList=new ArrayList<Student>();
//		pstmt=connection.prepareStatement("select * from student");
//		resultSet=pstmt.executeQuery();
//		while(resultSet.next()){
//			Student student=new Student();
//			student.setStudentId(resultSet.getString(1));
//			student.setFirstName(resultSet.getString(2));
//			student.setLastName(resultSet.getString(3));
//			student.setAge(resultSet.getInt(4));
//			student.add(student);
//		return null;
//	    }
//	}
//}

//	public Object getAllStudent() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
//	
//	public List<Student> getAllStudent{
//		List<Student> studentList=new List<Student>();
//		pstmt=connection.prepareStatement("select * from student");
//		resultSet=pstmt.executeQuery();
//		while(resultSet.next()){
//			Student student=new Student();
//			student.setStudentId(resultSet.getString(1));
//			student.setFirstName(resultSet.getString(2));
//			student.setLastName(resultSet.getString(3));
//			student.setAge(resultSet.getInt(4));
//			student.add(student);
//		}
//	}
//}

	