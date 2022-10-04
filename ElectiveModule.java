public class ElectiveModule extends Module {
    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public ElectiveModule(String name, String departmentName, int semester, int seed,int credit) {
        super(name, semester, seed,credit);
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return String.format("+ Module:\n- Name: %s \n+ Code: %s\n+ Semester: %s\n+ Department: %s\n +credit: %s\n",
                this.getName(), this.getCode(), this.getSemester(), departmentName, this.getCredit());
    }
}
