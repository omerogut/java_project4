
public class SalariedEmployee extends Employee{
    private double weeklySalary; 
	
	public double getPaymentAmount() {
    	 return getWeeklySalary();
     }
	public SalariedEmployee(String firstName,String lastName,String socialSecurityNumber,double weeklySalary) {
		super(firstName,lastName,socialSecurityNumber);
		if(weeklySalary>=0) {
		this.weeklySalary=weeklySalary;
		}
		else {
			System.out.println("Warning");
		}
		}
	private double getWeeklySalary() {
		return weeklySalary;
		 
	}
	private void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	public String toString() {
		return "salaried employee: "+super.toString()+"\n"+
			   "weekly salary: "+getWeeklySalary();
	}
}
