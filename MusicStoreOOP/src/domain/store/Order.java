package domain.store;

public class Order {
    private final int orderID;
    private DigitalProduct digitalProduct[];
    private static int contadorOrders;
    private static final int MAX_DPRODUCTS = 2;
    private int contadorDProducts;
    
    public Order(){
        this.orderID = ++Order.contadorOrders;
        this.digitalProduct = new DigitalProduct[Order.MAX_DPRODUCTS];
    }
    
    public void agregarProducto(DigitalProduct digitalProduct){
        if(this.contadorDProducts < Order.MAX_DPRODUCTS){
            this.digitalProduct[this.contadorDProducts++] = digitalProduct;
        }
        else{
            System.out.println("Has superado el limite: " + Order.MAX_DPRODUCTS);
        }
    }
    
    public void showOrder(){
        System.out.println("Order #: " + this.orderID);
        System.out.println("Order Product #: " + this.orderID);
        for (int i = 0; i < this.contadorDProducts; i++) {
            System.out.println(this.digitalProduct[i]);
        }
    }
}
