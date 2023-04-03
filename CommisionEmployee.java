

public class CommisionEmployee {

	protected String firstName;
	protected String lastName;
	protected String socialSecurityNumber;
	protected double grossSales;
	protected double commisionRate;
	
	public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commisionRate ) {
				
		if(grossSales< 0 || commisionRate==1 || commisionRate>1 || commisionRate==0 || commisionRate<0) {
			
			System.out.println("ERROR! YOU SHOULD GET CORRECT VALUES! ");
			 System.exit(0);
		}else{
			this.firstName = firstName;
			this.lastName = lastName;
			this.socialSecurityNumber = socialSecurityNumber;
			this.grossSales = grossSales;
			this.commisionRate = commisionRate;
			
		}
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommisionRate() {
		return commisionRate;
	}
	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}

	//public void name() {
	public double earnings()	{
		
		return this.grossSales*this.commisionRate;
		
	}



	@Override
	public String toString() {
		return "CommisionEmployee [firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityNumber="
				+ socialSecurityNumber + ", grossSales=" + grossSales + ", commisionRate=" + commisionRate + "]";
	}


	
}	

