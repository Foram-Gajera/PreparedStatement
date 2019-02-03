package in.ac.adit.ajt.prepare;

public class Student {

		// TODO Auto-generated method stub
		private String StudentId;
		private String FirstName;
		private String LastName;
		private int Age;
		public String getStudentId() {
			return StudentId;
		}
		public void setStudentId(String studentId) {
			StudentId = studentId;
		}
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			FirstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public int getAge() {
			return Age;
		}
		public void setAge(int age) {
			Age = age;
		}
		@Override
		public String toString() {
			return "Student [StudentId=" + StudentId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Age="
					+ Age + "]";
		}
		
		


}
