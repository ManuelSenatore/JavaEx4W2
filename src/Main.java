import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Product> p1 = new ArrayList<>();
        List<Order> o1 = new ArrayList<>();
        List<Product> p2 = new ArrayList<>();


        Customer c1 = new Customer("pippo", 2);
        Customer c2 = new Customer("gino", 2);
        Customer c3 = new Customer("marco", 2);
        Customer c4 = new Customer("zio", 2);
        Customer c5 = new Customer("pio", 2);
        Customer c6 = new Customer("nino", 2);
        Customer c7 = new Customer("anto", 2);
        Customer c8 = new Customer("ugo", 2);

        List<Customer> c = new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8));

        for (int i = 0; i < 50; i++) {
            p1.add( new Product("Libro-" +i, Category.Books, Math.floor(Math.random()* 100 +100)));
            o1.add( new Order(p1, c.get((int) Math.floor(Math.random()*8))));
            p2.add( new Product("Boys-" +i, Category.Boys, Math.floor(Math.random()* 20 +1)));
           // p3.get(i).sale(10);
        }

        Stream<Product> prodotti1 = p1.stream();
        Stream<Order> ordini1 = o1.stream();
        Stream<Product> prodotti2 = p2.stream();

        prodotti1.forEach(System.out::println);
        ordini1.forEach(System.out::println);
        prodotti2.forEach(System.out::println);

        getDueInData(o1);

    }
    public static void getDueInData(List<Order> arr){
        List<Order> searchedList = arr.stream()
                .filter(c -> c.getCustomer().getTier() == 2)
                .collect(Collectors.toList());

        AtomicInteger i= new AtomicInteger();
        searchedList.forEach((e)->{
            System.out.println(e);
            i.getAndIncrement();
        });

        System.out.println(i+ " Elementi Trovati");

    }
}
