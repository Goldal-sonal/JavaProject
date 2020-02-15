package Inheritance;

class Employee {
	float salary=45000;
}
class Programmer extends Employee
{
	public int bonus=10000;
	public static void main(String[] args) {
		Programmer obj=new Programmer();
		System.out.println(obj.salary);
		System.out.println(obj.bonus);
		
		

	}

}
