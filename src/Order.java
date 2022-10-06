import java.time.LocalDate;
import java.util.List;


public class Order {
    private static long id = 0L;
    private Status status;
    private LocalDate orderDate;
    LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    Order( List<Product> products, Customer customer){
        this.status = Status.CONFERMATO;
        this.orderDate = LocalDate.now();
        this.deliveryDate = deliveryDate;
        setProducts(products);
        setCustomer(customer);
        id = id++;
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products){
        this.products = products;
    }

    public void orderShipped(){
        if(status == Status.CONFERMATO){
            status = Status.SPEDITO;
            deliveryDate = LocalDate.now();
        } else{
            System.out.println("questo ordine è stato già spedito, consegnato o cancellato");
        }
    }
    @Override
    public String toString(){
        return getProducts() +  ", " + getCustomer() ;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
