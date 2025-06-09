package prototype;

import java.util.ArrayList;
import java.util.List;

public class pricelist implements IPrototype{

    private String name;
    private List<product> products;

    public pricelist(String name, List<product> products) {
        this.name = name;
        this.products = products;
    }
    public pricelist(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<product> getProducts() {
        return products;
    }
    public void setProducts(List<product> products) {
        this.products = products;
    }
    @Override
    public IPrototype clone() {
        return new pricelist(name, products);
    }

    @Override
    public IPrototype deepClone() {
        pricelist clonedList = new pricelist(name);
        List<product> clonedProducts = new ArrayList<>();
        for (product p : products) {
            clonedProducts.add((product) p.clone());
        }
        clonedList.products = clonedProducts;
        return clonedList;

    }
    @Override
    public String toString() {
        return Integer.toHexString(hashCode()) + " pricelist{" +
                "\n name='" + name + '\'' +
                ",\n products=" + products +
                '}';
    }
}
