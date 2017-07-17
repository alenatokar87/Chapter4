package Hometask_5;

import javax.persistence.*;

@Entity
@Table(name = "TMP_ADDRESS")
public class Address  {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_sequence")
    @SequenceGenerator(name = "address_sequence",
            sequenceName = "sequence_addr",
            initialValue = 1,
            allocationSize = 1)
    @Column(name = "addressid")
    private int id;
    private String country;
    private String postcode;
    private String district;
    private String city;
    private String street;
    private String houseno;
    private String flat;

    @ManyToOne
    @JoinColumns(
            {@JoinColumn(name = "CONTRAGENTID", referencedColumnName = "ID"),
                    @JoinColumn(name = "SITEID", referencedColumnName = "SITEID")
            }
    )
    private Contragent contragent;


    public Address() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseno() {
        return houseno;
    }

    public void setHouseno(String houseno) {
        this.houseno = houseno;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public Contragent getContragent() {
        return contragent;
    }

    public void setContragent(Contragent contragent) {
        this.contragent = contragent;
    }

    public Address(String country, String postcode, String district, String city, String street, String houseno, String flat, Contragent contragent) {
        this.country = country;
        this.postcode = postcode;
        this.district = district;
        this.city = city;
        this.street = street;
        this.houseno = houseno;
        this.flat = flat;
        this.contragent = contragent;
    }
}
