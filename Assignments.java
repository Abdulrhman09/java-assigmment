import javax.swing.JOptionPane;

class Address{
	int Postalcode;
	String Street;
	String City;

	
	  Address(int p , String s , String c) {
		Postalcode = p;
		Street = s;
		City = c;
	}
	
}

class Employee {
int id;
String name;
Address address;
}


class Hourly_Employee extends Employee{
	int pay_per_hour;
	
	
	Hourly_Employee (int d , String n ,Address p, String s , String c ,  int o){
		
	    
		id = d;
		super.name = n;
		super.address= p;
		pay_per_hour = o;
	}


	
	void Show_all_info() {
		 
		
		
		System.out.println(  "Emp id:" +""  + id);
		System.out.println( "Emp name: " +"" + name);
		System.out.println( "Emp hours: "  + "" + pay_per_hour);
		System.out.println( "Emp Postalcode: " + "" + address.Postalcode);
		System.out.println( "Emp city: "  + "" + address.City);
		System.out.println("Emp street: " + "" + address.Street);
		
		}
	}






public class Assignments {

	public static void main(String[] args) {
	

		
		Hourly_Employee emp[] = new Hourly_Employee[3]  ;
            for(int i = 0; i <=2; i++) {
		int d =  Integer.parseInt (JOptionPane.showInputDialog("Enter your id plese " ));
			String n = (JOptionPane.showInputDialog("Enter your name plese " ));
			int o =  Integer.parseInt  (JOptionPane.showInputDialog("Enter your overtime plese " ));
			int p = Integer.parseInt (JOptionPane.showInputDialog("Enter your postalcode plese " ));
			String c = (JOptionPane.showInputDialog("Enter your city plese " ));
			String s = (JOptionPane.showInputDialog("Enter your street plese " ));
			
			
			Address ad = new Address (p , "s" , "c");
          
		    emp[i] = new Hourly_Employee( d ,"n" , ad ,  "c" , "s" ,o);
		  
           }
            
            
            for(int i = 0; i <=2; i++) {
            	
           emp[i].Show_all_info(); 
	      
            }
	}

}
