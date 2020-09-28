import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
//        List<Product> filteredList = productsList.stream().filter(x->x.price>30000).collect(Collectors.toList());
//        System.out.println(filteredList);
//        List<Float> priceList = productsList.stream().filter(x->x.price>25000).map(x->x.price).collect(Collectors.toList());
//        System.out.println(priceList);
//        Stream.iterate(1,element->element+1).filter(x->x%5==0).limit(5).collect(Collectors.toList()).forEach(System.out::println);
//
//        Stream.of(1,3,4,5,6,7).collect(Collectors.toList()).forEach(System.out::println);
//        Float a = productsList.stream().map(x->x.price).reduce(0.0f,(sum,price)->sum+price);
//        Float a = productsList.stream().map(x->x.price).reduce(0.0f,Float::sum);
//        Product a = productsList.stream().max((product1,product2)->product1.price>product2.price?1:-1).get();
//        Product a = productsList.stream().min((product1,product2)->product1.price>product2.price?1:-1).get();
//        Long count = productsList.stream().filter(x->x.price>25000).count();
//        Set<Product> productSet = productsList.stream().collect(Collectors.toSet());
        Map<String,Float> productMap = productsList.stream().collect(Collectors.toMap(p->p.name,v->v.price));
        System.out.println(productMap);
    }
}  