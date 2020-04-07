public class Student {
private String name, surname;
private StudyMajors studymajors;
private int yearOfStudy;
private double averageGrades;

    public Student(String name, String surname, StudyMajors studymajors, int yearOfStudy, double averageGrades) {
        this.name = name;
        this.surname = surname;
        this.studymajors = studymajors;
        this.yearOfStudy = yearOfStudy;
        this.averageGrades = averageGrades;
    }
}
