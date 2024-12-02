package ua.edu.ucu;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Autorisation autorisation = new Autorisation();
        if (autorisation.autorise(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
