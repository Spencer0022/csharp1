/*
Employee Class
 */
package employeeproductionworkerdemo;

public class Employee {
    private String name; 
    private String empNumber; //XXX-L validate somewhere
    private String hireDate; //MM-DD-YY
    //Employee Number needs to be validated somewhere to make sure in format of 
    //XXX-L X being 0-9 and L being a letter between A-M
    public Employee(String name,String empNumber,String hireDate){
        this.name=name;
        this.empNumber=empNumber;
        this.hireDate=hireDate;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmpNumber(String empNumber){
        this.empNumber=empNumber;
    }
    public void setHireDate(String hireDate){
        this.hireDate=hireDate;
    }
    public String getName(){
       return this.name;
    }
    public String getEmpNumber(){
        return this.empNumber;
    }
    public String getHireDate(){
        return this.hireDate;
    }
    public String toString(){
        return "Employee: "+this.name+" was hired on "+this.hireDate+", ID number is "+this.empNumber;
    }
    
    
}
