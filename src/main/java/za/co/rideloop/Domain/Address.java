package za.co.rideloop.Domain;


/**
 * Address.java
 * Address model class
 *
 * Author: Rotondwa Rambau
 * Student Number: 222342145
 * Group: 3I
 */
public class Address {
    private String streetName;
    private String suburb;
    private String province;
    private String zipCode;

    public Address() {

    }

    public Address(String streetName, String suburb, String province, String zipCode) {
        this.streetName = streetName;
        this.suburb = suburb;
        this.province = province;
        this.zipCode = zipCode;
    }

    private Address(Builder builder) {
        this.streetName = builder.streetName;
        this.suburb = builder.suburb;
        this.province = builder.province;
        this.zipCode = builder.zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getProvince() {
        return province;
    }

    public String getZipCode() {
        return zipCode;
    }

    public static class Builder {
        private String streetName;
        private String suburb;
        private String province;
        private String zipCode;

        public Builder() {
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}