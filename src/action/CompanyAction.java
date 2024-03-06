package action;

import model.Department;
import model.Employee;

import java.util.List;
import java.util.Scanner;

public class CompanyAction {

    public Department createDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input ID: ");
        String id = scanner.nextLine();
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        System.out.print("Input domain: ");
        String domain = scanner.nextLine();
        return new Department(id, name, domain);
    }

    public Department searchDepartment(String departmentName, List<Department> departmentList) {
        for (int i = 0; i < departmentList.size(); i++) {
            if (departmentName.equals(departmentList.get(i).getName())) {
                return departmentList.get(i);
            }
        }
        return null;
    }

    public Employee createEmployee() {
        return null;
//        return new Employee()
    }

    public void updateDepartment(List<Employee> employees, String departmentId) {
        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).setDepartmentId(departmentId);
        }
    }
}
