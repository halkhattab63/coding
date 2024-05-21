package relationships;



public class Department {
    private int depyNo;
    private String deptName; 

    public Department() {
    }

    public Department(int depyNo, String deptName) {
        this.depyNo = depyNo;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" + "depyNo=" + depyNo + ", deptName=" + deptName + "}";
    }
    
}
