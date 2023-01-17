package rw.ac.rca.smis.orm;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "mark")
public class Mark {

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "course_id")
    private Course course;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  id;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "student_id")
    private Student student;
    private double maxMark;


    public double getMaxMark() {
        return maxMark;
    }

    public void setMaxMark(double maxMark) {
        this.maxMark = maxMark;
    }

    public Mark(double maxMark){
        this.maxMark = maxMark;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
