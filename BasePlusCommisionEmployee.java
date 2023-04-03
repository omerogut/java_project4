
public class BasePlusCommisionEmployee extends CommisionEmployee {

    private double baseSalary;
    public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commisionRate,double baseSalary){
        super(firstName,lastName,socialSecurityNumber,grossSales,commisionRate);
        if(baseSalary>=0) {
            this.setBaseSalary(baseSalary);
        }
        else {
            System.out.println("Warning");
        }
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double Salary) {
        if(Salary>=0) {
            baseSalary=Salary;
        }
        else {
            System.out.println("Warning");
        }
    }
    public double earnings() {
        return super.earnings()+getBaseSalary();
    }
    public String toString() {
        return super.toString()+
                "Base salary: "+getBaseSalary()+"\n"+
                "Earnings: "+earnings();
    }
}
