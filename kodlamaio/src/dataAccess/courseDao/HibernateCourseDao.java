package dataAccess.courseDao;

import entities.Course;

public class HibernateCourseDao implements ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Hibernate veri tabanı eklendi.");

    }
}
