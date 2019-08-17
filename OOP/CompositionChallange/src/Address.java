/**
 * Created by UGURINAL
 * 8/15/2019
 * 11:48 PM
 */


public class Address {
    private String addressName;
    private String country;
    private String city;
    private String streetAddress;
    private String state;
    private String zipCode;

    public Address(String addressName, String country, String city, String state, String streetAddress, String zipCode) {
        this.addressName = addressName;
        this.country = country;
        this.city = city;
        this.state = state;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
    }

    public String getAddressName() {
        return addressName;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getZipCode() {
        return zipCode;
    }
}
