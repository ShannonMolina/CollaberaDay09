package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Student {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws AgeInputException {
		if(age<=0)
			throw new AgeInputException("Age should be greater than zero.");
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student[age="+name+ ", age=" + age + "]";
	}
	
	public static void main(String[] args) throws AgeInputException {
		Student student = new Student();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the student's name: ");
		String name = scan.nextLine();
		student.setName(name);
		
		System.out.print("Enter the student's age: ");
		int age;
		try {
			age = scan.nextInt();
			student.setAge(age);
			System.out.println(student);
		} catch (InputMismatchException e) {
			System.out.println("Input Mismatch Exception occurred!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Age cannot be zero! Please try again");
			System.out.print("Enter the student's age: ");
			age = scan.nextInt();
			student.setAge(age); // propogate the exception
			System.out.println(student);
		}
		
	}
}
