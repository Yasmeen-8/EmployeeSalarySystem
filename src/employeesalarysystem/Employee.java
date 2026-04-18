package employeesalarysystem;

import java.util.ArrayList;


public class Employee {
    
    private int ID;
    private String name;
    private String address;
    private String phone;
    
    
    public Employee(){
    ID++;
    }
    
    public ArrayList<MonthlyRecord> getMonlthyRecords() {
        
        return null;
    }
    
    public double calcMonthlySalary(int i){
        double calc = 0;
        
    return calc;}
    
    public void addRecord(MonthlyRecord record){
    
    }
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    

    
}
