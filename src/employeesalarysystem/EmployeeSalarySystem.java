package employeesalarysystem;

import static java.lang.String.valueOf;
import java.util.*;

public class EmployeeSalarySystem {
    
    static ArrayList<Employee> Employees = new ArrayList<Employee>();
    static Scanner Scan = new Scanner(System.in);
    static int navigation = 0;
    
    public static void main(String[] args) {
        System.out.println("System added employees confirm?");
        String yes = Scan.next();
        menu();
      }
    
    public static void menu(){
            do{
                System.out.println("");
                System.out.println("");
            System.out.println("Please choose an option from the following menu:");
            System.out.println("        1. Add Employee to the system");
            System.out.println("        2. Record monthly hours for part time tutor");
            System.out.println("        3. Print monthly salary report");
            System.out.println("        4. Print part time tutor monthly salary history");
            System.out.println("        5. Exit");
            navigation = Scan.nextInt();
        }while(navigation >= 6 || navigation <= 0);
        checknum();
    }
    
    public static void checknum(){
        switch(navigation){
            case 1:
                addEmployee();
            break;
            case 2:
                recordMonthlyHoursPartTime();
            break;
            case 3:
                printMonthlySalaryReport();
            break;
            case 4:
                printPartTimeTutorSalaryHistory();
            break;
            case 5:
                System.out.println("Thank you for using our system.");
                System.exit(0); break;
            default: menu(); break;
        }
    }
    
    public static void addEmployee(){ // needs fixing
        
        int input;
        System.out.println("--- Adding employee ---");
        System.out.println("");
        System.out.println("What type of employee?:");
        System.out.println("    1: Salaried Tutor");
        System.out.println("    2: Administrator");
        System.out.println("    3: Part Time Tutor");
        input = Scan.nextInt();
        
        Employee person;
        switch(input){
        case 1: person = new SalariedTutor(); empMenu(person); Employees.add(person);break;
        case 2: person = new Administrator(); empMenu(person); Employees.add(person);break;
        case 3: person = new SalariedTutor(); empMenu(person); Employees.add(person);break;
        default: addEmployee(); break;
        }
        
        System.out.println("Person added");
        
    }
    
    public static void recordMonthlyHoursPartTime(){
        int id = 0;
        System.out.println("--- record monthly hours for part time employee ---");
        System.out.println("");
        System.out.println("Enter employee id:");
        id = Scan.nextInt();
        
        Employee person = Employees.get(id);
        
        if(person instanceof PartTimeTutor){
            double hours = 0;
            System.out.println("Enter hours: ");
            MonthlyRecord record = new MonthlyRecord();
            hours = Scan.nextDouble();
            record.setHoursWorked(hours);
            person.addRecord(record);
            System.out.println("Done.");
            menu();
        }else{
            System.out.println("This person is not a part time tutor");
            recordMonthlyHoursPartTime();
        }
    }
    
    public static void printMonthlySalaryReport(){
        System.out.println("Printing employees monthly salaries...");
        System.out.println("");
        System.out.println("");
        addEmployeesToSystem();
        for(int i = 0; i < Employees.size() - 1; i++){
            Employee emp = Employees.get(i);
            System.out.println("---------------------------------------");
            System.out.println(i + ":  ID = " + emp.getID() + " Name = " + emp.getName() + " Phone = " + emp.getPhone() + "   || Monthly Salary: " + String.valueOf(emp.calcMonthlySalary(i)) );
        }
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("Completed task.");
    }
    
    public static void printPartTimeTutorSalaryHistory(){
        int id;
        System.out.println("--- Print part time tutor salary history ---");
        System.out.println("");
        System.out.println("Enter employee id:");
        id = Scan.nextInt();
        
        Employee emp = Employees.get(id);
        
        if(emp instanceof PartTimeTutor){
            System.out.println(id + ":  ID = " + emp.getID() + " Name = " + emp.getName() + " Phone = " + emp.getPhone());
            ArrayList<MonthlyRecord> records = emp.getMonlthyRecords();
            
            for(int i = 0; i < records.size(); i++){
            MonthlyRecord record = records.get(i);
            System.out.println("Year: " + record.getYear() + " | Month: " + record.getMonth() + " | Monthly salary: " + emp.calcMonthlySalary(i));
            }
            
        }else{
            System.out.println("This person is not a part time tutor");
            recordMonthlyHoursPartTime();
        }
        
    
    }
    
    
    public static void empMenu(Employee person){
    do{
        System.out.println("What information would you like to add?");
        System.out.println("        1: name");
        System.out.println("        2: phone");
        System.out.println("        3: address");
        System.out.println("        4: <--- Return to Main Menu");
    }while(navigation >= 4 || navigation <= 0);
    navigation = Scan.nextInt();
    checknumForEmp(person);
    }
    
    public static void checknumForEmp(Employee person){
            String input;
            switch(navigation){
            case 1:
                System.out.println("Enter name:");
                input = Scan.next();
                person.setName(input);
                empMenu(person);
            break;
            case 2: 
                System.out.println("Enter phone number:");
                input = Scan.next();
                person.setPhone(input);
                empMenu(person);
            break;
            case 3: 
                System.out.println("Enter address:");
                input = Scan.next();
                person.setAddress(input);
                empMenu(person);
            break;
            case 4 : menu();break;
            default: empMenu(person); break;
            }
    }

    public static void addEmployeesToSystem(){
        Double Y = 53.3;
        for(int i = 0; i < 5; i++){
        PartTimeTutor person = new PartTimeTutor();
        person.setName("Person " + valueOf(i));
        person.setAddress("JHSADKJASH");
        person.setPhone("12341234");
        Y = Y*2;
        person.setHourlyRate(Y);
        Employees.add(person);
        }
        for(int i = 0; i < 5; i++){
        SalariedTutor person = new SalariedTutor();
        person.setName("Person " + valueOf(i));
        person.setAddress("JHSADKJASH");
        person.setPhone("12341234");
        person.setMastersHolder(true);
        Employees.add(person);
        }
        for(int i = 0; i < 5; i++){
        Administrator person = new Administrator();
        person.setName("Person " + valueOf(i));
        person.setAddress("JHSADKJASH");
        person.setPhone("12341234");
        Employees.add(person);
        }
    
    }
}
