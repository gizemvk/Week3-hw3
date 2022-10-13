package dataAccess.categoryDao;

import entities.Category;

public class JdbcCategoryDao implements ICategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("JDBC veri tabanı eklendi.");

    }
}
