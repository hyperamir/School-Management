
public class Student {

	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	public Student(int id, String name, int grade) {
		this.id=id;
		this.name=name;
		this.grade=grade;
		this.feesPaid=0;
		this.feesTotal=30000;
		
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void payFees(int fee) {
		feesPaid+=fee;
		School.updateTotalEarned(fee);
	}
	
	public int getFeesPaid() {
		return feesPaid;
	}
	
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}
	
	@Override
	public String toString() {
		return "name: "+name+"total paid: $"+feesPaid;
	}
	
	
}
