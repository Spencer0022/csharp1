
package personcustomerdemo;

public class Person {
    private String name;
    private String address;
    private String telephone;
    
    public Person(){
        this.name="";
        this.address="";
        this.telephone="";
    }
    public Person(String name,String address,String telephone){
        this.name=name;
        this.address=address;
        this.telephone=telephone;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }
    public void setTelephone(String telephone){
        this.telephone=telephone;
    }
    public String getTelephone(){
        return telephone;
    }
    public String toString(){
        return "Name: "+name+"\nAddress: "+address+"\nTelephone Number: "+telephone;
    }
    
}
