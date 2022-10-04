public class Module {
  private  String name;
  private  String code;
  private  int semester;
  private int credit;


  private String codeGenerator(int semester, int seed) {
    return "M" + (100 * semester + seed);
  }

  public String toString() {
    return String.format("+ Module:\n- Name: %s\n- Code: %s\n- Semester: %s\n -credit: %s\n",  name, code, semester, credit);
  }

  public Module(String name, int semester, int seed, int credit) {
    this.code = codeGenerator(semester, seed);
    this.name = name;
    this.semester = semester;
    this.credit=credit;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public int getSemester() {
    return semester;
  }

  public void setSemester(int semester) {
    this.semester = semester;
  }

  public int getCredit() {
    return credit;
  }

  public void setCredit(int credit) {
    this.credit = credit;
  }
}
