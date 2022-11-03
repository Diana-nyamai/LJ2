package learnspring;
//pojo model or bean
public class Employee {
//    attributes
    int eid;
    String ename;
    int esalary;

//    constructor
    public Employee(int eid, String ename, int esalary) {
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEsalary() {
        return esalary;
    }

    public void setEsalary(int esalary) {
        this.esalary = esalary;
    }
}
