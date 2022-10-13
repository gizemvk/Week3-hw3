import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DataBaseLogger;
import core.logging.FileLogger;
import core.logging.ILogger;
import core.logging.MailLogger;
import dataAccess.categoryDao.HibernateCategoryDao;
import dataAccess.categoryDao.JdbcCategoryDao;
import dataAccess.courseDao.HibernateCourseDao;
import dataAccess.instractorDao.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {


        ILogger[] loggers = {new FileLogger(), new MailLogger(), new DataBaseLogger()};

        Course course1 = new Course(3, "Java Developer", 1000);
        List<Course> courseNm = new ArrayList<>();

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), courseNm, loggers);
        courseManager.add(course1);

        System.out.println("...............................................");

        Instructor instructor1 = new Instructor(4, "Engin Demiroğ", 50);
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
        instructorManager.add(instructor1);

        System.out.println("...............................................");


        Category category1 = new Category(5, "Backend developer.");
        List<Category> categoryNm = new ArrayList<>();
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categoryNm);
        categoryManager.add(category1);

    }
}