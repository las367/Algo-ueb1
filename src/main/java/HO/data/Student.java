package HO.data;

public class Student {

    private String surname;
    private String prename;
    private int course;
    private int matriculationNumber;


    public Student(String surname, String prename, int course, int matriculationNumber) {
        this.surname = surname;
        this.prename = prename;
        this.course = course;
        this.matriculationNumber = matriculationNumber;
    }


    @Override
    public String toString() {
        return "{" +
            " surname='" + getSurname() + "'" +
            ", prename='" + getPrename() + "'" +
            ", course='" + getCourse() + "'" +
            ", matriculationNumber='" + getMatriculationNumber() + "'" +
            "}";
    }


    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPrename() {
        return this.prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public int getCourse() {
        return this.course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getMatriculationNumber() {
        return this.matriculationNumber;
    }

    public void setMatriculationNumber(int matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

}