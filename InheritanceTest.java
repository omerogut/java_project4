
public class InheritanceTest {

	public static void main(String[] args) {
		BasePlusCommisionEmployee name = new BasePlusCommisionEmployee("bob", "levis", "3333", 5000d, 0.04d , 300d);

		System.out.println("FirstName "+name.getFirstName());
		System.out.println("LastName "+name.getLastName());
		System.out.println("SocialSecurityNumber "+name.getSocialSecurityNumber());
		System.out.println("GrossSales "+name.getGrossSales());
		System.out.println("CommisionRate "+name.getCommisionRate());
		System.out.println("BaseSalary "+name.getBaseSalary());
		
		
		
		name.setBaseSalary(20);
		System.out.println(name.toString());
	}

}
