package employeesalarysystem;


public class FullTimeStaff extends Employee {
    
    private double annualSalary;

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    public FullTimeStaff(){
    
    }
    
    @Override
    public double calcMonthlySalary(int i){
        double calc = 0;
        calc = annualSalary/12;
    
    return calc;}
    
    
}
