package posbackend;

public class NewOrder {
    
    private String item;
    private Integer burgerQuantity = 0;
    private Double burgerPrice = 6.99;
    private Integer fryQuantity = 0;
    private Double fryPrice =6.99;
    private Double pizzaPrice = 10.99;
    private Integer pizzaQuantity = 0;
    private Double beveragePrice = 1.00;
    private Integer beverageQuantity = 0;
    private Double orderTotal=0.00;
    private Double currentOrderPrice=0.00;
    private String currentOrder="";

    public Double getTotal(){
        orderTotal = 0.00;
        orderTotal += burgerQuantity * burgerPrice;
        orderTotal += fryQuantity * fryPrice;
        orderTotal += pizzaQuantity * pizzaPrice;
        orderTotal += beverageQuantity * beveragePrice;
        return orderTotal;
    }
    public String getCurrentOrder() {
        return currentOrder;
    }
    public String getItem() {
        return item;
    }
    public void addItem(String item) {
        if(item == "Burger"){
            burgerQuantity += 1;
            currentOrder += "Burger\n";
        }
        else if(item=="Fry"){
            fryQuantity += 1;
            currentOrder += "Fry\n";

        }
        else if (item=="Pizza"){
            pizzaQuantity +=1;
            currentOrder += "Pizza\n";

        }
        else if (item=="Beverage"){
            beverageQuantity +=1;
            currentOrder += "Beverage\n";

        }

        
    }
    
    public void reset(){
        burgerQuantity = 0;
        fryQuantity = 0;
        pizzaQuantity = 0;
        beverageQuantity = 0;
        orderTotal = 0.00;
        currentOrder = "";
        
    }
    }

    
    
    
    

