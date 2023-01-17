package rw.ac.rca.smis.dao;

import rw.ac.rca.smis.orm.Course;

import java.util.List;

public interface CourseDAO {
  public Course saveCourse(Course course);
  public Course updateCourse(Course course);
  public  Course saveOrUpdateCourse(Course course);
  public  boolean deleteCourse(Course course);
  public Course getCourseById(int courseId);
  public List<Course> getAllCourses();
}
