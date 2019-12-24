package Pre4.Pre3;

public class HourlyEmployee extends ColaEmployee{
    private int a;
    private int b;
    public HourlyEmployee(){

    }
    public HourlyEmployee(int a ,int b){
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void getSalary(int month) {
        if (b>160){
        System.out.println("工资为："+((a-160)*b*1.5+160*b));}else {
            System.out.println("工资为"+a*b);
        }
    }
}
