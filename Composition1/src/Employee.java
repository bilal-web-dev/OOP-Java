public class Employee {

    private int empId;
    private String empName;
    private Address empAdd;

    public Employee(int empId, Address empAdd) {
        this.empId = empId;
        this.empAdd = empAdd;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Address getEmpAdd() {
        return empAdd;
    }

    public void setEmpAdd(Address empAdd) {
        this.empAdd = empAdd;
    }
}
