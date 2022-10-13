package dataAccess.instractorDao;

import entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {



    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC veri tabanı eklendi.");

    }
}
