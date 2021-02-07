package tutorial.example.day2;

public class Address {
    // attributes
    private String number;  // protected, public, private
    private String street;
    private String city;
    private String province;
    private String country;
    private String postalCode;

    // functions
    // return a complete address e.g. "17973 amalfi pierrefonds, quebec, canada, h9m 1k2"
    public String getAddress()
    {
        String address = number + " " + street + " " + city + ", " + province + ", " + country + ", " + postalCode;
        return address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String numberParam) {
        this.number = numberParam;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(final String street)
    {
        this.street = street;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(final String city)
    {
        this.city = city;
    }

    public String getProvince()
    {
        return province;
    }

    public void setProvince(final String province)
    {
        this.province = province;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(final String country)
    {
        this.country = country;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public void setPostalCode(final String postalCode)
    {
        this.postalCode = postalCode;
    }


}
