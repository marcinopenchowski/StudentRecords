public class Student{
private String name, surname;
private StudyMajors studyMajors;
private int yearOfStudy;
private double averageGrades;

    public Student(String name, String surname, StudyMajors studyMajors , int yearOfStudy) {
        this.name = name;
        this.surname = surname;
        this.studyMajors = studyMajors;
        this.yearOfStudy = yearOfStudy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public StudyMajors getStudyMajors() {
        return studyMajors;
    }

    public void setStudyMajors(StudyMajors studyMajors) {
        this.studyMajors = studyMajors;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public double getAverageGrades() {
        return averageGrades;
    }

    public void setAverageGrades(double averageGrades) {
        this.averageGrades = averageGrades;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + studyMajors + " " + yearOfStudy + " "+ averageGrades;
    }
}


