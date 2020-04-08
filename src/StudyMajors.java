public enum StudyMajors {
    ARCHITEKTURAWNETRZ("Architektura Wnętrz"),
    GRAFIKA("Grafika"),
    INFORMATYKA ("Informatyka"),
    KULTUROZNAWSTWO ("Kulturoznawstwo"),
    ZARZADZANIEINFORMACJA ("Zarządznie Informacją");

    String s;

    StudyMajors(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
