public class Student {
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

    @Override
    public String toString() {
        return name + " " + surname + " " + studyMajors + " " + yearOfStudy + " "+ averageGrades;
    }
}


