
package employeesalarysystem;


public class Administrator extends FullTimeStaff{
    
    private boolean additionalDuty;
    
    public Administrator(){
    additionalDuty = false;
    }

    public boolean isAdditionalDuty() {
        return additionalDuty;
    }

    public void setAdditionalDuty(boolean additionalDuty) {
        this.additionalDuty = additionalDuty;
    }
    
    @Override
    public double calcMonthlySalary(int i){
        double calc = 0;
        double monthlySalary = this.getAnnualSalary() * 12;
        if(additionalDuty){
        calc = monthlySalary*0.02;
        }else{
        calc = monthlySalary;
        }
        
    return calc;}
}
