package rw.ac.rca.smis.orm;

import org.apache.poi.hssf.record.formula.functions.Char;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private  String name;
    private Date date;
    private String gender;

    public Person(String name, Date date, String gender) {
        this.name = name;
        this.date = date;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGender(Char gender) {
        this.gender = gender.toString();
    }


    public void setId(int id) {
        this.id = id;
    }
}
