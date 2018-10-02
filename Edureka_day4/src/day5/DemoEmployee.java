package day5;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring variable
		Employee preeti,asha;
		//Instantiating and intializing variable
		preeti=new Employee();
		preeti.CalculateSalary();
		preeti.salary=10000;
		preeti.bonus=800;
		
		preeti.CalculateSalary();
		preeti.CalculateSalary1(1000, 200);
		
		////////////////////////////////////////
		
		asha= new Employee(234,67);
		

	}

}
