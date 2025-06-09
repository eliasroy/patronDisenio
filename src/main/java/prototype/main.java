package prototype;

import java.util.List;

public class main {

    public static void main(String[] args) {

        pricelist priceList = new pricelist("Summer Sale");
        List<product> products = List.of(
                new product("Apple", 1.0),
                new product("Banana", 0.5),
                new product("Cherry", 2.0)
        );
        priceList.setProducts(products);

        System.out.println("Original Price List: " + priceList.toString());
        pricelist clonedPriceList = (pricelist) priceList.clone();
        System.out.println("Cloned Price List: " + clonedPriceList.toString());
        pricelist deepClonedPriceList = (pricelist) priceList.deepClone();
        System.out.println("Deep Cloned Price List: " + deepClonedPriceList.toString());

    }
}
