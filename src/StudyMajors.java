public enum StudyMajors {
    INTERIOR_DESIGN("Architektura_Wnętrz"),
    GRAPHICS("Grafika"),
    INFORMATICS ("Informatyka"),
    CULTURAL ("Kulturoznawstwo"),
    INFORMATION_MANAGEMENT ("Zarządznie_Informacją");

    String s;

    StudyMajors(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
