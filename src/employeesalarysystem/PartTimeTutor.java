
package employeesalarysystem;

import java.util.ArrayList;


public class PartTimeTutor extends Employee{
    private double hourlyRate;
    private double monthlySalary;
    private ArrayList<MonthlyRecord> monthyRecords = new ArrayList<MonthlyRecord>();
    
    
    @Override
    public ArrayList<MonthlyRecord> getMonlthyRecords() {
        return monthyRecords;
        
    }
    
    @Override
    public void addRecord(MonthlyRecord record){
        monthyRecords.add(record);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    
    @Override
    public double calcMonthlySalary(int i){
        double calc = 0;
        if(i < 0 || i >= monthyRecords.size()){
            return 0;
        }
        calc = hourlyRate * monthyRecords.get(i).getHoursWorked();
    return calc;}
}
