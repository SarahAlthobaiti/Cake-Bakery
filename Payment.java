public class Payment {
    
private String paymentMethod;
private double paymentCost;
private final double CHARGE=0.15;

    public Payment() {
    }

    public Payment(String paymentMethod,double paymentCost, double CHARGE){
        
    }

    
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    public String getPaymentMethod() {
        return paymentMethod;
    }
    
    public void setPaymentCost(double paymentCost) {
        this.paymentCost = paymentCost;
    }
    
    public double getPaymentCost() {
        return paymentCost;
    }

    public double calculateAmount(double paymentCost){
        
     double total=paymentCost*CHARGE;   
     return total;   
        
    }

   
    
}
