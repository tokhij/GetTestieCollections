package models;

public class Address {
    private String street;
    private String town;
    private String postCode;
    private String country;

    /**
     * Construct an models.Address without country
     */
    public Address(String street, String town, String postCode) {
        this(street, town, postCode, "");
    }

    /**
     * Construct an models.Address with full details
     */
    public Address(String street, String town, String postCode, String country) {
        this.street = street;
        this.town = town;
        this.postCode = postCode;
        this.country = country;
    }

    /**
     * Return a string representation of this object.
     */
    public String toString() {
        return street + "\n" + town + " " + postCode + "\n" + country + "\n";
    }
}
