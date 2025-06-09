package prototype;


public class product implements IPrototype
{

    private String name;
    private double price;

    public product() {
        // Constructor logic here
    }
    public product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public IPrototype clone() {
        return new product(name, price);
    }

    @Override
    public IPrototype deepClone() {
        return null; // Assuming no deep cloning is needed for primitive types
    }
    @Override
    public String toString() {
        return Integer.toHexString(hashCode()) + " product{" +
                "\n name='" + name + '\'' +
                ",\n price=" + price +
                '}';
    }
}
