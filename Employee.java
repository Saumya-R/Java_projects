package basic;

public class Employee {

	int id;
	String name;
	float totalSalary,basicSalary,hra,da;
	
	void HRACalculation()
	{
	      hra=(0.18f)*basicSalary;
	}
	void DACalculation()
	{
		da=(0.20f)*basicSalary;		
	}
	void TotalSalaryCal()
	{
		HRACalculation();
		DACalculation();
		totalSalary=(float)(basicSalary+hra+da);
	}
	
}

