import action.CompanyAction;
import model.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Department> departmentList =  new ArrayList<>();
        CompanyAction companyAction =  new CompanyAction();
        Department department = companyAction.createDepartment();
        departmentList.add(department);
        departmentList.add(companyAction.createDepartment());
        System.out.print("Input name to find: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(companyAction.searchDepartment(sc.nextLine(), departmentList));
    }
}