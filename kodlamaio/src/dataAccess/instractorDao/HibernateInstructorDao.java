package dataAccess.instractorDao;

import entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate veri tabanı eklendi.");

    }
}
