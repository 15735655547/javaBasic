package Pre4.Pre3;

public class SalesEmployee extends ColaEmployee{
    private int a;
    private double b;
    public  SalesEmployee(int a ,int b){
        this.a = a;
        this.b = b;
    }
    public SalesEmployee(){}
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void getSalary(int month) {
        System.out.println("工资为："+(a*b));
    }
}
