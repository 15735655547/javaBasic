package Pre4.Pre3;

public abstract class ColaEmployee {
    private String name;
    private int date;

    public ColaEmployee() {
    }

    public ColaEmployee(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public abstract void getSalary(int month);

}
