public class Address {
    private String streetAdd;
    private String town;
    private String city;
    private String country;
    private PhoneNumber phoneNum;

    public Address(String streetAdd, String town, String city, String country, PhoneNumber phoneNum) {
        this.streetAdd = streetAdd;
        this.town = town;
        this.city = city;
        this.country = country;
        this.phoneNum = phoneNum;
    }

    public String getStreetAdd() {
        return streetAdd;
    }

    public void setStreetAdd(String streetAdd) {
        this.streetAdd = streetAdd;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
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

    public PhoneNumber getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(PhoneNumber phoneNum) {
        this.phoneNum = phoneNum;
    }
}
