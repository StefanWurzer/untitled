package listenUndDu;

import java.util.Objects;

public class Student {
    private int matNr;
    private String fullName;

    public Student(int matNr, String fullName) {
        this.matNr = matNr;
        this.fullName = fullName;
    }


    public String toString() {
        return "Student{" +
                "matNr=" + matNr +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public int getMatNr() {
        return matNr;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matNr == student.matNr && Objects.equals(fullName, student.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matNr, fullName);
    }
}
