package model;

public class Employee {
    private String id;
    private String title;
    private String fullName;
    private String domains;
    private String position;
    private Double monthlySalary;
    private String departmentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDomains() {
        return domains;
    }

    public void setDomains(String domains) {
        this.domains = domains;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(Double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", fullName='" + fullName + '\'' +
                ", domains='" + domains + '\'' +
                ", position='" + position + '\'' +
                ", monthlySalary=" + monthlySalary +
                ", departmentId='" + departmentId + '\'' +
                '}';
    }

    public Employee(String id, String title, String fullName, String domains, String position, Double monthlySalary, String departmentId) {
        this.id = id;
        this.title = title;
        this.fullName = fullName;
        this.domains = domains;
        this.position = position;
        this.monthlySalary = monthlySalary;
        this.departmentId = departmentId;
    }
}
