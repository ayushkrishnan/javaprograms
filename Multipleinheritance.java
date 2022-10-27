class Employeee
  {
        String name;
        int age;
        String phoneNumber;
        String address;
        double salary;
       
     Employeee(String n, int a, String p, String ad, double s)
       {
         name = n;
         age = a;
         phoneNumber = p;
         address = ad;
         salary = s;
        }
void printSalary()
       {
          System.out.println("Salary is : " + salary);
        }
  }
class Officer extends Employeee
{

    String specialization;
    Officer(String name, int age, String phoneNumber,String address, double salary, String specialization)
     {
       super(name, age, phoneNumber, address, salary);
         this.specialization = specialization;
         System.out.println("name="+name);
         System.out.println("age="+age);
         System.out.println("phone number="+phoneNumber);
         System.out.println("address="+address);
         System.out.println("specialization="+specialization);
         
     }
}
class Manager extends Employeee
{
        String department;
        public Manager(String name, int age, String phoneNumber,String address, double salary, String department)
        {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("phone number="+phoneNumber);
        System.out.println("address="+address);
        System.out.println("department="+department);
        }
}

  
public class Multipleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Officer officer = new Officer("Beegum", 59, "846554599", "sjcet", 668329.0, "IT");
        officer.printSalary();
        Manager manager = new Manager("Chinju", 30, "987654340", "sjcet", 709860.00, "IT");
        manager.printSalary();

	}

}
