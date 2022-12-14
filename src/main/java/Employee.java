import java.util.List;

public class Employee {
    //I did private fields access modifiers for encapsulation.
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    private List<Integer> monthlyWorkHours;

    public Employee(String name, double salary, int workHours, int hireYear, List<Integer> monthlyWorkHours
    ) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.monthlyWorkHours = monthlyWorkHours;

    }

    //We can access fields by setter and getter.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
    public List<Integer> getWorkHour() {
        return monthlyWorkHours;
    }

    public void setWorkHour(List<Integer> workHour) {
        this.monthlyWorkHours = workHour;
    }


    public double tax() {
        double tax;
        if (salary < 1000) {
            tax = salary * 0;
        } else {
            tax = salary * 0.03;
        }
        return tax;
    }

    //Weekly bonus calculate
    public double bonus() {
        double bonus;
        if (workHours > 40) {
            int extraHours;
            extraHours = workHours - 40;
            bonus = extraHours * 30;
        } else {
            return 0;
        }
        return bonus;
    }

    //Montly bonus calculate
    public double monthlyBonus() {
        double bonus = 0;
        int extraHours = 0;

        for (Integer item : monthlyWorkHours) {
            if (item > 40) {
                extraHours = extraHours + (item - 40);
            }
        }
        bonus = extraHours * 30;
        return bonus;
    }

    //I used with bonus and tax, when I calculated raise salary.
    public double raiseSalary() {
        double raiseSalary = 0;
        int totalYear = 2021 - hireYear;
        if (totalYear < 10) {
            raiseSalary = (salary + monthlyBonus() - tax()) * 0.05;
        } else if (totalYear > 9 && totalYear < 20) {
            raiseSalary = (salary + monthlyBonus() - tax()) * 0.1;
        } else if (totalYear > 19) {
            raiseSalary = (salary + monthlyBonus() - tax()) * 0.15;
        }
        return raiseSalary;
    }

    // total salary = salary + increase of salary + bonus
    public double totalSalary() {
        double total = salary + raiseSalary() + monthlyBonus();
        return total;
    }

    public double netSalary(){
        double netSalary = salary - tax() + monthlyBonus();
        return netSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                ", monthlyWorkHours=" + monthlyWorkHours +
                '}';
    }
}

