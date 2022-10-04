public class Enrolment {
    private Student student;
    private char finalGrade;
    private double examMark;
    private Module module;
    private double internalMark;

    public Enrolment(Student student, Module module) {
        this.student = student;
        this.module = module;
    }

    public Student getStudent() {
        return student;
    }

    public Module getModule() {

        return module;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public double getInternalMark() {
        return internalMark;
    }

    public double getExamMark() {
        return examMark;
    }

    public char getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(char finalGrade) {
        this.finalGrade = finalGrade;
    }

    public void setInternalMark(double internalMark) {
        this.internalMark = internalMark;
    }

    public void setExamMark(double examMark) {
        this.examMark = examMark;
    }

    public void setFinalGrade() {
        double finalMark = examMark * 0.6 + internalMark * 0.4;
        if (finalMark >= 95) finalGrade = 'E';
        else if (finalMark < 95 && finalMark >= 75) finalGrade = 'G';
        else if ( finalMark < 75 && finalMark >= 20) finalGrade = 'P';
        else finalGrade = 'F';
    }

    public String toStringWithoutMarks() {
        return String.format("*** ENROLMENT ***\n%s\n%s############################\n\n", student, module);
    }

    public String toString() {
        return String.format("*** ENROLMENT ***\n%s%sInternal Mark: %s\nExamination Mark: %s\nFinal Grade:" +
                " %s\n############################\n\n", student, module, internalMark, examMark, finalGrade);
    }
}
