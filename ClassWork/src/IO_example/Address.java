package IO_example;

import java.io.Serializable;

public class Address implements Serializable{

    String street;
    String country;
    
    public Address(){
     this.street = "";
     this.country = "";
    }
    public Address(String street, String country){
     this.street = street;
     this.country = country;
    }
    
    public void setStreet(String street){
     this.street = street;
    }
    
    public void setCountry(String country){
     this.country = country;
    }
    
    public String getStreet(){
     return this.street;
    }
    
    public String getCountry(){
     return this.country;
    }
    
    @Override
    public String toString() {
        return new StringBuffer(" Street : ")
        .append(this.street)
        .append(" Country : ")
        .append(this.country).toString();
    }
    
}