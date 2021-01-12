package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
    @Id
    private String Cid;
    private String name;
    private String NIC;
    private String address;
    private String contact;
    private String email;


    @OneToOne(mappedBy = "customer1")
    private Rent rent;

    @OneToOne(mappedBy = "customer")
    private RentalReq rentalReq;

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Cid='" + Cid + '\'' +
                ", name='" + name + '\'' +
                ", NIC='" + NIC + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", rent=" + rent +
                ", rentalReq=" + rentalReq +
                '}';
    }

    public Customer(String cid, String name, String NIC, String address, String contact, String email, Rent rent, RentalReq rentalReq) {
        Cid = cid;
        this.name = name;
        this.NIC = NIC;
        this.address = address;
        this.contact = contact;
        this.email = email;
        this.rent = rent;
        this.rentalReq = rentalReq;
    }

    public String getCid() {
        return Cid;
    }

    public void setCid(String cid) {
        Cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public RentalReq getRentalReq() {
        return rentalReq;
    }

    public void setRentalReq(RentalReq rentalReq) {
        this.rentalReq = rentalReq;
    }
}