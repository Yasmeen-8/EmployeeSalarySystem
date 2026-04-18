
package employeesalarysystem;


public class SalariedTutor extends FullTimeStaff{
    
    private boolean mastersHolder;
    private boolean phdHolder;

    public boolean isMastersHolder() {
        return mastersHolder;
    }

    public void setMastersHolder(boolean mastersHolder) {
        this.mastersHolder = mastersHolder;
    }

    public boolean isPhdHolder() {
        return phdHolder;
    }

    public void setPhdHolder(boolean phdHolder) {
        this.phdHolder = phdHolder;
    }
    
    public SalariedTutor(){
    mastersHolder = false;
    phdHolder = false;
    }
    
    @Override
    public double calcMonthlySalary(int i){
        double calc = 0;
        double monthlySalary = this.getAnnualSalary() * 12;
        if(mastersHolder == true){
        calc = monthlySalary*0.05;
        }else if(phdHolder == true){
        calc = monthlySalary*0.1;
        }else{
            calc = monthlySalary;
            }
    
    return calc;}
}
