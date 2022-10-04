import java.util.ArrayList;
import java.util.List;

public class CourseManProg {

  public static void main(String[] args) {
    List<Module> modules = initialiseModules();
    List<Student> students = initialiseStudents();
    List<Enrolment> enrolments = initialiseEnrolments(students, modules);
    EnrolmentManager enrolmentManager = new EnrolmentManager();
    enrolmentManager.importEnrolments(enrolments);
    System.out.println("*** NON-SORTED INITIAL REPORT ***\n");
    System.out.println(enrolmentManager.report());
    enrolmentManager.sort();
    System.out.println("*** SORTED INITIAL REPORT  ***\n");
    System.out.println(enrolmentManager.report());
    setMarkForAll(enrolmentManager, students, modules);
    System.out.println(enrolmentManager.reportAssessment());
  }

  private static void setMarkForAll(EnrolmentManager enrolmentManager, List<Student> students, List<Module> modules) {
    for (int i = 0; i < students.size(); ++i) {
      Module module = modules.get(i);
      Student student = students.get(i);
      double internalMark = (60 * Math.random()) + 40;
      double examMark = (100* Math.random());
      enrolmentManager.setMarks(student, module, internalMark, examMark);
    }
  }

  private static List<Module> initialiseModules() {
    List<Module> modules = new ArrayList<>();
    modules.add(new CompulsoryModule("Software Engineering 1", 2, 0,20));
    modules.add(new ElectiveModule("Multimedia", "MUL", 1, 1,21));
    modules.add(new CompulsoryModule("Software Engineering 2", 2, 2,22));
    modules.add(new CompulsoryModule("Special Subject 1", 1, 3,23));
    modules.add(new ElectiveModule("Web Programming", "FIT", 2, 4,24));
    return modules;
  }

  private static List<Student> initialiseStudents() {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Hoang Minh Giang", "11/2/2002", "Nam Dinh", "zexaldai@gmail.com", 0));
    students.add(new Student("Nguyen Quoc Dat", "25/3/2001", "Ha Noi", "vivu12323@gmail.com", 1));
    students.add(new Student("Nguyen Hoang Hai", "11/3/1999", "Hai Phong", "lab06@gmail.com", 2));
    students.add(new Student("Do Xuan That", "3/2/2003", "An Giang", "hot1hot2@gmail.com", 3));
    students.add(new Student("Ha Thi Yen", "19/10/1998", "Da Nang", "manman@gmail.com", 4));
    return students;
  }

  private static List<Enrolment> initialiseEnrolments(List<Student> students, List<Module> modules) {
    List<Enrolment> enrolments = new ArrayList<>();
    for (int i = 0; i < students.size(); ++i) {
      Student student = students.get(i);
      Module module = modules.get(i);
      Enrolment newEnrolment = new Enrolment(student, module);
      enrolments.add(newEnrolment);
    }
    return enrolments;
  }
}
