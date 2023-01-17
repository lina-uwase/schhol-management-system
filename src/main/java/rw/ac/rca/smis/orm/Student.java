package rw.ac.rca.smis.orm;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "student")


public class Student extends  Person {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private Set<Mark> marks;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "address_id")
    private Address address;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "course_id")
    private Course course;
    private int age;
    private String height;

    public Student(String name, int age, String height, String gender, Date date) {
        super(name,date,gender);
        this.age = age;
        this.height = height;
    }



    public Set<Mark> getMarks() {
        return marks;
    }

    public void setMarks(Set<Mark> marks) {
        this.marks = marks;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    

}
