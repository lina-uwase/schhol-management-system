package rw.ac.rca.smis.orm;


import javax.persistence.*;

@Entity
@Table(name = "address")

public class Address {



   private String name;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int address_id;

   private String street_address;
   private String postal_code;

    private int id;
    public Address( String name, String street_address,String postal_code ) {
        this.id = address_id;
        this.name = name;
        this.street_address = street_address;
        this.postal_code = postal_code;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet_address() {
        return street_address;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String  getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }
}
