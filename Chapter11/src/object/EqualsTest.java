package object;


class Student{
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) { // 업캐스팅해서 넘어옴
		if (obj instanceof Student) { // Student 인지 체크 
			Student std = (Student) obj; // 다운캐스팅 
			if (studentID == std.studentID) return true;
			else return false;
		}
		return false;
	}
	
	
	public int hashCode() {
		return studentID;
		
	}
	
	
	
	
}
public class EqualsTest {

	
	public static void main (String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2); //두 인스턴스 주소가 다르므로 false
		System.out.println(str1.equals((str2))); //두 인스턴스의 값이 같으므로 true
		
		Student std1 = new Student(10001, "tomas");
		Student std2 = new Student(10001, "tomas");
		
		System.out.println(std1==std2);
		System.out.println(std1.equals(std2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
	}
}
