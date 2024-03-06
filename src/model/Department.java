package model;

public class Department {
    private String id;
    private String name;
    private String domain;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", domain='" + domain + '\'' +
                '}';
    }

    public Department(String id, String name, String domain) {
        // neu ID khong start bang DE thi khong cho khoi tao
        this.id = id;
        this.name = name;
        this.domain = domain;
    }
}
