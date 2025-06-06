package builder.damain;

import builder.IBuild;

public class Address {
    private String address;
    private String city;
    private String country;

    public static class AddressBuilder implements IBuild {
        private String address;
        private String city;
        private String country;
        public AddressBuilder(){

        }
        public AddressBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
        public AddressBuilder setCity(String city) {
            this.city = city;
            return this;
        }
        public AddressBuilder setCountry(String country) {
            this.country = country;
            return this;
        }
        @Override
        public Address build() {
            return new Address(address, city, country);
        }
    }
    public Address(String address, String city, String country) {
        this.address = address;
        this.city = city;
        this.country = country;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
