
public class PayableInterfaceTest {

	public static void main(String[] args) {
		Payable payableObjects[] = new Payable[6];
		payableObjects[0] = new Invoice(1234," (seat)",2,375.0);
		payableObjects[1] = new Invoice(56789," (tire)",4,79.95);
		payableObjects[2] = new SalariedEmployee("John","Smith","111-11-1111",800.00);
		payableObjects[3] = new HourlyEmployee("Karen","Price","222-22-2222",16.75,40.00);
		payableObjects[4] = new CommissionEmployee("Sue","Jones","333-33-3333",10000.00,0.06);
		payableObjects[5] = new BasePlusCommissionEmployee("Bob","Lewis","444-44-4444",5000.00,0.04,300.0);
        System.out.println("------ Invoices and Employees processed polymorphically:------\n");
		for(int i=0;i<payableObjects.length;i++){
    	 
    	  System.out.println(payableObjects[i]);
    	   if ( payableObjects[i] instanceof BasePlusCommissionEmployee ){
           double salary = ((BasePlusCommissionEmployee) payableObjects[5]).getBaseSalary();
    	   salary+=salary/10;
    	   ((BasePlusCommissionEmployee) payableObjects[5]).setBaseSalary(salary);
    	   System.out.println("new base salary with 10% increase is: "+salary);
		   }
    	   
    	   System.out.println("payment amount: $"+payableObjects[i].getPaymentAmount());
    	   System.out.println("");
       }
       
       for(int j=0;j<payableObjects.length;j++) {
    	   System.out.println("Payable object "+j+" is a "+payableObjects[j].getClass().getName());
       }
	}
}
