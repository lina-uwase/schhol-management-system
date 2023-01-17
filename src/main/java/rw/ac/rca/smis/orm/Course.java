package rw.ac.rca.smis.orm;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "courses")

public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;


	private  String name;
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="instructor_id")
	private Instructor instructor;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "course")
	private Set<Mark>marks;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "course")
	 private Set<Student>students;

	public int period;
	private String teachingHours;


	public Course( String name,int period,String teachingHours){
		this.id =id;
		this.name = name;
		this.teachingHours = teachingHours;
//		this.instructor = instructor;
//		this.period = period;
//		this.student = student;
	}


	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}





	public Set<Mark> getMarks() {
		return marks;
	}

	public void setMarks(Set<Mark> marks) {
		this.marks = marks;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}
}
