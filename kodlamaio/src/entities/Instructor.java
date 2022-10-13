package entities;

public class Instructor {
  private   int id;
  private   String name;
  private int workHour;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public Instructor(int id, String name, int workHour) {
        this.id = id;
        this.name = name;
        this.workHour = workHour;























    }
}
