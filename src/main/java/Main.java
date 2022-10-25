import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        char tl = '\u20ba';

        List<Integer> wHours = new ArrayList<Integer>();
        wHours.add(45);
        wHours.add(42);
        wHours.add(50);
        wHours.add(40);

        Employee employee1 = new Employee("Eda Özyurt", 2000, 45, 1985, wHours);

        System.out.println("Name = " + employee1.getName());
        System.out.println("Salary = " + employee1.getSalary() + tl);
        System.out.println("Work Hours = " + employee1.getWorkHours());
        System.out.println("Hire Year = " + employee1.getHireYear());
        System.out.println("Tax = " + employee1.tax() + tl);
        System.out.println("Weekly Bonus = " + employee1.bonus() + tl);
        System.out.println("Monthly Bonus " + employee1.monthlyBonus() + tl);
        System.out.println("Raise Salary = " + employee1.raiseSalary() + tl);
        System.out.println("Total Salary = " + employee1.totalSalary() + tl);
        System.out.println("Net Salary = " + employee1.netSalary() + tl);
        System.out.println(employee1.toString());

    }
}
