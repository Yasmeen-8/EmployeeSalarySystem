
package employeesalarysystem;

import java.util.Calendar;

public class MonthlyRecord {
    private int year;
    private int month;
    private double hoursWorked;

    public double getHoursWorked() {
        return hoursWorked;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    
    public MonthlyRecord(){
        Calendar cal = Calendar.getInstance();
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH)+1; 
    }
    
    
}
