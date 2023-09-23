public class Address {
    private String city;
    private String country;

    public Address(String city, String country) {
        setCity(city);
        setCountry(country);

    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
