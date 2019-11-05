package basic;

public class test {

	public static void main(String[] args) {
		Employee E1=new Employee();
		
		E1.id=12;
		E1.name="Sharayu";
		E1.basicSalary=1000.00f;
		//E1.HRACalculation();
		//E1.DACalculation();
		E1.TotalSalaryCal();
		
		System.out.println("Id="+E1.id+"\nName="+E1.name+"\nTotal Salary="+E1.totalSalary);
		
	}
}
