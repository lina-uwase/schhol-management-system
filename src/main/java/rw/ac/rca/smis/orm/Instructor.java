package rw.ac.rca.smis.orm;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "instructor")
public class Instructor extends  Person {

    @OneToMany(cascade=CascadeType.ALL,mappedBy = "instructor")
    private List<Course> courses;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "address_id")
    private Address address;

    public Instructor( String name,String gender,Date date) {
        super(name,date,gender);
    }

    public Address getAddress() {
        return address;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
