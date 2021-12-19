
package personcustomerdemo;


public class Customer extends Person{
    
    private String customerNumber;
    private boolean mailingList;
    
    public Customer(){
        super();
        this.customerNumber="";
        this.mailingList=false;
    }
    public Customer(String name,String address,String telephone,String customerNumber,boolean mailingList){
        super(name,address,telephone);
        this.customerNumber=customerNumber;
        this.mailingList=mailingList;
    }
    public void setCustomerNumber(String customerNumber){
        this.customerNumber=customerNumber;
    }
    public String getCustomerNumber(){
        return customerNumber;
    }
    public void setMailingList(boolean mailingList){
        this.mailingList=mailingList;
    }
    public boolean getMailingList(){
        return mailingList;
    }
    @Override
    public String toString(){
        return "Name: "+getName()+"\nAddress: "+getAddress()+
                "\nTelephone Number: "+getTelephone()+"\nMailing List: "+
                mailingList+"\nCustomer Number: "+customerNumber;
    }
    
    
}
