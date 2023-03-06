package pl.javastart.task;

public class Address {

    private String locationName;
    private String postCode;
    private String city;
    private String streetName;
    private int houseNumber;

    public Address(String locationName, String postCode, String city, String streetName, int houseNumber) {
        this.locationName = locationName;
        this.postCode = postCode;
        this.city = city;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }
}

