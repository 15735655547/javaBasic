package Pre4.Pre3;

public  class  SalariedEmployee extends ColaEmployee{
    private int a;
    public SalariedEmployee(int a){
        this.a = a;
    }
    public SalariedEmployee(){}
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void getSalary(int month) {
        System.out.println("工资为："+(a));
    }
}
