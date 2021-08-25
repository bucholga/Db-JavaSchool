package day8.adapter;


import java.util.List;
import java.util.function.Supplier;


public class ProductRepo {

    private List<Supplier<? extends Costable>> products = List.of(Chair::new, Table::new);

    public Costable getProduct() {
        return  design_patterns.mails.RandomUtil.getRandomElement(products).get();
    }
}
