
public class BasePlusCommissionEmployee extends CommissionEmployee{
    double baseSalary;
    public BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commissionRate,double baseSalary) {
    super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
    if(baseSalary>=0) {
    	this.baseSalary=baseSalary;
    }
    else {
    	System.out.println("Warning"); 
    }
  }
    
   
    public double getPaymentAmount() {
  	   return super.getPaymentAmount()+baseSalary;
     }
    public double getBaseSalary() {
 		return baseSalary;
 	}
 	public void setBaseSalary(double baseSalary) {
 		this.baseSalary = baseSalary;
 	}
 	public String toString() {
    	return "base salaried "+super.toString()+"; "+"base salary: "+getBaseSalary();
    			
    }
}
