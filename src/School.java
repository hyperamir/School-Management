import java.util.ArrayList;
import java.util.List;

public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalEarned;
	private static int totalSpent;
	
	public School(List<Student> students, List<Teacher> teachers) {
		
		this.teachers=teachers;
		this.students=students;
		this.totalEarned=0;
		this.totalSpent=0;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}
	
	public int getTotalEarned() {
		return totalEarned;
	}
	
	public static void updateTotalEarned(int newEarning) {
		totalEarned+=newEarning;
	}
	
	public int getTotalSpent() {
		return totalSpent;
	}
	
	public static void updateTotalSpent(int newSpend) {
		totalEarned-=newSpend;
	}
	
	
	
	
}
