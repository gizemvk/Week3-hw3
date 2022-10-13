package business;

import core.logging.ILogger;
import dataAccess.courseDao.ICourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {


    private ICourseDao iCourseDao;
    private List<Course> courses;
    private ILogger[] iLoggers;

    public CourseManager(ICourseDao iCourseDao, List<Course> courses, ILogger[] iLoggers) {
        this.iCourseDao = iCourseDao;
        this.courses = courses;
        this.iLoggers = iLoggers;
    }

    public void add(Course course) throws Exception {

        if (course.getCoursePrize() < 0) {
            throw new Exception("Kurs fiyatı 0'dan küçük olamaz");

        }
        if (course.getCoursePrize() == 0) {

            System.out.println("Lütfen sıfırdan büyük bir sayı giriniz.");
        }
        iCourseDao.add(course);

        for (Course crs : courses) {

            if (crs.getCourseName().equals(course.getCourseName())) {
                throw new Exception("Kurs ismi birbirini tekrar edemez");

            }
        }
        courses.add(course);

        for (ILogger logger : iLoggers
        ) {
            logger.log(" Course: " + course.getCourseName());
        }


    }

}
