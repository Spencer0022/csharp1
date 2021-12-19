/*
ProductionWorker class extension of Employee.java
 */
package employeeproductionworkerdemo;

public class ProductionWorker extends Employee{
    
    private int shift; // 1(day) or 2(night)
    private double hourlyRate; //$perhr
    
    public ProductionWorker(String name,String empNumber,String hireDate,int shift,double hourlyRate){
        super(name,empNumber,hireDate);
        this.shift=shift;
        this.hourlyRate=hourlyRate;
    }
    public void setShift(int shift){
        this.shift=shift;
    }
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate=hourlyRate;
    }
    public int getShift(){
        return this.shift;
    }
    public double getHourlyRate(){
        return this.hourlyRate;
    }
    public String toString(){
        return "Employee: "+getName()+" was hired on "+getHireDate()+", ID number is "+getEmpNumber()+". Shift number: "+getShift()+" with an hourly rate of "+getHourlyRate();
    }
    
}
