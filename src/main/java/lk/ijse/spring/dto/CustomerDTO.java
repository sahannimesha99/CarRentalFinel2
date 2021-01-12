package lk.ijse.spring.dto;

public class CustomerDTO {
    private String Cid;
    private String name;
    private String NIC;
    private String address;
    private String contact;
    private String email;

    public CustomerDTO(String cid) {
        Cid = cid;
    }

    public CustomerDTO(String cid, String name, String NIC, String address, String contact, String email) {
        Cid = cid;
        this.name = name;
        this.NIC = NIC;
        this.address = address;
        this.contact = contact;
        this.email = email;
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

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "Cid='" + Cid + '\'' +
                ", name='" + name + '\'' +
                ", NIC='" + NIC + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
