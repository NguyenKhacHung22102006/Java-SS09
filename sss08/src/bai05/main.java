package bai05;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new OfficeEmployee("Nguyen Van A", 10_000_000));
        employees.add(new ProductionEmployee("Tran Thi B", 300, 20_000));
        employees.add(new ProductionEmployee("Le Van C", 150, 30_000));

        double totalSalary = 0;

        System.out.println("Danh sách lương nhân viên:");

        int index = 1;
        for (Employee e : employees) {
            double salary = e.calculateSalary();
            totalSalary += salary;

            if (e instanceof OfficeEmployee) {
                System.out.println(index + ". " + e.getName()
                        + " (Office) - Lương: " + String.format("%,.0f", salary));
            } else if (e instanceof ProductionEmployee) {
                ProductionEmployee p = (ProductionEmployee) e;
                System.out.println(index + ". " + e.getName()
                        + " (Production) - Lương: "
                        + String.format("%,.0f", salary)
                        + " (" + p.getNumOfProducts()
                        + " sản phẩm * "
                        + String.format("%,.0f", p.getPrice()) + ")");
            }
            index++;
        }

        System.out.println("\n=> TỔNG LƯƠNG CÔNG TY: "
                + String.format("%,.0f", totalSalary));
    }
}

