import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student amir = new Student(1, "Amir", 8);
		Student joe = new Student(2, "Joe", 12);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(amir);
		studentList.add(joe);
		
		Teacher emma = new Teacher(1, "Emma", 45000);
		Teacher rose = new Teacher(2, "Rose", 35000);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(rose);
		teacherList.add(emma);
		
		School ghs = new School(studentList, teacherList);
		
		amir.payFees(5000);
		amir.payFees(20000);
		joe.payFees(6000);
		System.out.println("ghs has earned: $"+ghs.getTotalEarned());
		
		System.out.println("-----school pay salary-----");
		emma.recieveSalary(emma.getSalary());
		System.out.println("GHS spent $"+emma.getSalary()+" to "+emma.getName()+" and now has $"
				+ghs.getTotalEarned());
		rose.recieveSalary(rose.getSalary());
		System.out.println("GHS spent $"+rose.getSalary()+" to "+rose.getName()+" and now has $"
				+ghs.getTotalEarned());
		
		System.out.println(amir);
		
	}

}
