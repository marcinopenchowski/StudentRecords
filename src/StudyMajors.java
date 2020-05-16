public enum StudyMajors {
    INTERIOR_DESIGN("Architektura Wnętrz"),
    GRAPHICS("Grafika"),
    INFORMATICS ("Informatyka"),
    CULTURAL ("Kulturoznawstwo"),
    INFORMATION_MANAGEMENT ("Zarządznie Informacją");

    String s;

    StudyMajors(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
