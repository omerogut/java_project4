
public class CommissionEmployee extends Employee{
   double commissionRate;
   double grossSales;
    public CommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commissionRate) {
	super( firstName, lastName,socialSecurityNumber);
	if(grossSales>=0) {
		this.grossSales=grossSales;
	}
	else {
		System.out.println("Warning");
	}
	if(commissionRate>0&&commissionRate<1) {
		this.commissionRate=commissionRate;
	} 
	else {
		System.out.println("Warning");
	}
}

protected double getCommissionRate() {
	return commissionRate;
}
protected void setCommissionRate(double commissionRate) {
	this.commissionRate = commissionRate;
}
protected double getGrossSales() {
	return grossSales;
}
protected void setGrossSales(double grossSales) {
	if(grossSales>=0) {
		this.grossSales=grossSales;
	}
	else {
		System.out.println("Warning");
	}
}
public double getPaymentAmount() {
	   return getCommissionRate()*getGrossSales();
}
public String toString() {
	return  "commission employee: "+super.toString()+"\n"+
			"gross sales: "+getGrossSales()+"; "+"commission rate: "+getCommissionRate();
         

}
}
