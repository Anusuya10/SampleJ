package org.college;

public class College {
	private void collegeName() {
		System.out.println("American University");

	}
	private void collegeCode() {
		System.out.println("253535");

	}
	private void collegeRank() {
		System.out.println("1 st Rank");
		System.out.println("1 st Rank");

	}
	public static void main(String[] args) {
		College a = new College();
				a.collegeName();
				a.collegeCode();
				a.collegeRank();
				Student b = new Student();
				b.studentName();
				b.studentDept();
				b.studentId();
				Hostel c = new Hostel();
						c.hostelName();
						Dept d = new Dept();
						d.deptName();
	}

}
