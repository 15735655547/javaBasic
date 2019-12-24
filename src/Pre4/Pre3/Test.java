package Pre4.Pre3;

public class Test {
    public void payWage(ColaEmployee emp, int month) {
        emp.getSalary(month);

    }


    public static void main(String[] args) {
        ColaEmployee salariedEmployee = new SalariedEmployee();
        ColaEmployee hourlyEmployee = new HourlyEmployee();
        ColaEmployee salesEmployee = new SalesEmployee();
        ColaEmployee[] array = {salariedEmployee, hourlyEmployee, salesEmployee};
        for (int i = 0; i < array.length; i++){
            array[i].getSalary(2);
        }
        Test test = new Test();
        test.payWage(new SalariedEmployee(10), 12);
        test.payWage(new SalesEmployee(40,4),11);
        test.payWage(new HourlyEmployee(2,5),10);

    }
}
