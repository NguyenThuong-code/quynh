import java.util.List;

public class EnrolmentManager {
    private List<Enrolment> enrolments;

    public Enrolment getEnrolment(Student student, Module module) {
        for (Enrolment enrolment : enrolments) {
            if (enrolment.getStudent().equals(student)
                    && enrolment.getModule().equals(module)) {
                return enrolment;
            }
        }
        return null;
    }

    public void addEnrolment(Enrolment enrolment) {
        enrolments.add(enrolment);
    }

    public void importEnrolments(List<Enrolment> enrolments) {
        this.enrolments = enrolments;
    }

    public String report() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Enrolment enrolment : enrolments) {
            stringBuilder.append(enrolment.toStringWithoutMarks());
        }
        return stringBuilder.toString();
    }

    public void setMarks(Student student, Module module, double internalMark, double examMark) {
        Enrolment enrolment = getEnrolment(student, module);
        enrolment.setExamMark(examMark);
        enrolment.setInternalMark(internalMark);
        enrolment.setFinalGrade();
    }

    public void sort() {
        enrolments.sort((enrolment1, enrolment2) ->
                (enrolment2.getStudent().getId()).compareTo(enrolment1.getStudent().getId()));
    }

    public String reportAssessment() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Enrolment enrolment : enrolments) {
            stringBuilder.append(enrolment);
        }
        return String.format("*** ASSESSMENT REPORT ***\n%s", stringBuilder);
    }
}
