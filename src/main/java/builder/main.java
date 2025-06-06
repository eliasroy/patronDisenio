package builder;

import builder.damain.Address;

public class main {

    public static void main(String[] args) {
        Address address = new Address.AddressBuilder()
                .setAddress("123 Main St")
                .setCity("Springfield")
                .setCountry("USA")
                .build();
    }

}
