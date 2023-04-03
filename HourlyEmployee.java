
public class HourlyEmployee extends Employee{
	private double hourlyWage;
	private double hoursWorked;
	
	public HourlyEmployee(String firstName,String lastName,String socialSecurityNumber,double hourlyWage,double hoursWorked) {
	    super(firstName,lastName,socialSecurityNumber);
	    if(hourlyWage>=0){
	    	this.hourlyWage=hourlyWage;
	    	
	    }
	    else {
	    	System.out.println("Warning");
	    }
	    if(hoursWorked>=0&&hoursWorked<168) { 
	    	this.hoursWorked=hoursWorked;
	    }
	    else {
	    	System.out.println("Warning");
	    }
	
	}
	
	private double getHourlyWage() {
		return hourlyWage;
	}
    private void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	private double getHoursWorked() {
		return hoursWorked;
	}
	private void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
     
	public double getPaymentAmount() {
   	    double payment = 0;
		if(getHoursWorked()<=40) {
   		    payment =getHourlyWage()*getHoursWorked();
   	       }
   	       else if (getHoursWorked()>40) {
   	    	   payment =(40*getHourlyWage())+(getHoursWorked()-40)*getHourlyWage()*1.5;
   	       }
	return payment;
    }
  
	public String toString() {
	  return  "hourly employee: "+super.toString()+"\n"+
			  "hourly wage: "+getHourlyWage()+"; hours worked: "+getHoursWorked();
	} 
      
}
