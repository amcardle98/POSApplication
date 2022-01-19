package posbackend;

import java.util.Date;

public class Employee {
    private String clockTime="";
    private String firstName;
    private String lastName;
    private String pin; 
    private Boolean clockedIn;
    
    public Employee(String firstName, String lastName, String pin){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        clockedIn = false;
    }
    public void setClockTime (){
       if(clockedIn){
        Date date = new Date ();
        clockTime += "Clocked out:     " + date + "\n";
       }
       else if(!clockedIn){
        Date date = new Date ();
        clockTime += "Clocked in:     " + date + "\n"; 
       }
    }
    public String getClockTime(){
        return clockTime;
    }
    public String getPin() {
        return pin;
    }
    public Boolean getClockedIn() {
        return clockedIn;
    }
    public void setClockedIn(Boolean clockedIn) {
        this.clockedIn = clockedIn;
    }    
    @Override
    public String toString(){
        return firstName + " " +  lastName;
    }
    
    
}
