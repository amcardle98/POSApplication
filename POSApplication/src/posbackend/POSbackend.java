package posbackend;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class POSbackend {
    
    private Double dailyTotal = 0.00;
    private String viewDailyOrders = "";
    private String customerInfo;
    private Integer currentEmployee;
    private Integer i;
    
    private final String managerPin = "2118";
    private String tempPin="";
    
    private List<Employee> employees;
    
    public void start(){
        this.employees = new ArrayList();

        
        Employee employee;
        employee = new Employee("Tylar", "Michalski", "2118");
        this.employees.add(employee);
        employee = new Employee("Jarrett", "Duskey", "9830");
        this.employees.add(employee);
        employee = new Employee("Lucas", "Bevacqua", "4237");
        this.employees.add(employee);
        employee = new Employee("Cody", "Miller", "1350");
        this.employees.add(employee);
        employee = new Employee("Alex", "Mcardle", "6227");
        this.employees.add(employee);
        employee = new Employee("Nick", "Jackson", "1216");
        this.employees.add(employee);
        employee = new Employee("Joe", "Downey", "7432");
        this.employees.add(employee); 
    }
    public boolean managerSignIn(){
        return Objects.equals(tempPin, managerPin);
    }
    public boolean signIn(String temporaryPin){
        boolean signincheck = false;
        for (i = 0; i < employees.size(); i++) {
            if(Objects.equals(temporaryPin, employees.get(i).getPin())){
                signincheck = true;
                currentEmployee = i;
                tempPin = temporaryPin;
            }
        }        
        return signincheck;
    }
    public Double updateDailyTotal (Double ticketTotal){
        dailyTotal+=ticketTotal;
        return dailyTotal;
    }
    public Employee getCurrentEmployee(){
        return employees.get(currentEmployee);
    }
    public String getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(String customerInfo) {
        this.customerInfo += customerInfo;
    }
    public Double getDailyTotal() {
        return dailyTotal;
    }

    public void setDailyTotal(Double dailyTotal) {
        this.dailyTotal += dailyTotal;
    }

    public String getViewOrders() {
        return viewDailyOrders;
    }

    public void setViewOrders(String viewOrders) {
        this.viewDailyOrders += viewOrders;
    }
    public String getEmployeeNameBackEnd(int index){
        return employees.get(index).toString();
    }
    public String getEmployeeClockBackEnd(int index){
        return employees.get(index).getClockTime();
    }
    public POSbackend getBackEnd(){
        return this;
    }
}
