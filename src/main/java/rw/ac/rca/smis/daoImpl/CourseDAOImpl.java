package rw.ac.rca.smis.daoImpl;

import rw.ac.rca.smis.dao.CourseDAO;
import rw.ac.rca.smis.orm.Course;

import javax.management.Query;
import java.util.List;

public class CourseDAOImpl extends DAO implements CourseDAO{
    private static CourseDAOImpl instance;
    private CourseDAOImpl(){

    }
    public static CourseDAOImpl getInstance(){
        if(instance ==null){
            return new CourseDAOImpl();
        }else {
            return  null;
        }

    }
    @Override
    public Course saveCourse(Course course) {
        return null;
    }
    @Override
    public Course getCourseById(int courseId) {
        return null;
    }
    @Override
    public Course updateCourse(Course course) {
        return null;
    }
    @Override
    public Course saveOrUpdateCourse(Course course) {
        try{
            begin();
            getSession().saveOrUpdate(course);
            commit();
            return course;
        }catch (Exception e){
            rollback();
            return null;
        }
    }
    @Override
    public List<Course> getAllCourses() {
        try{
            begin();
            Query query = (Query) getSession().createQuery("from store");
            List<Course> courses = ((org.hibernate.Query) query).list();
            commit();
            return courses;
        }catch (Exception e) {
            rollback();
            return null;
        }
    }
    @Override
    public boolean deleteCourse(Course course) {
        return false;
    }
};

