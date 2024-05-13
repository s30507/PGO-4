public class Address {
    public String createAddress(String country){
        return String.format("Country: %s", country);
    }

    public String createAddress(String country, String city){
        return String.format("Country: %s, city: %s", country, city);
    }

    public String createAddress(String country, String city, String Street){
        return String.format("Country: %s, city: %s, Street: %s", country, city, Street);
    }

    public String createAddress(String country, String city, String Street, int houseNumber){
        return String.format("Country: %s, city: %s, Street: %s, houseNumber: %d", country, city, Street, houseNumber);
    }
}
