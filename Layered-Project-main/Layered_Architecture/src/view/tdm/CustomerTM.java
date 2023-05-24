package view.tdm;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/

public class CustomerTM implements Comparable<CustomerTM> {
    private String id;
    private String name;
    private String address;

    public CustomerTM() {
    }

    public CustomerTM(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "view.tdm.CustomerTM{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    @Override
    public int compareTo(CustomerTM o) {
        return id.compareTo(o.getId());
    }
}