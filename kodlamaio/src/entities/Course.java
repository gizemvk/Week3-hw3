package entities;

public class Course {


    private int id;
    private String courseName;
    private int coursePrize;


    public Course( int id, String courseName, int coursePrize ) {
        this.id = id;
        this.courseName = courseName;
        this.coursePrize = coursePrize;


    }




    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }




    public int getId() {return id;}

    public void setId(int id) {
        this.id = id;
    }


    public int getCoursePrize() {
        return coursePrize;
    }

    public void setCoursePrize(int coursePrize) {
        this.coursePrize = coursePrize;
    }



}
