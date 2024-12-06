package ua.edu.ucu.task2;

public class Main {
    public static void main(String[] args) {
        // Rename the Ukrainian classes and methods
        DataBase db = new DataBase();          // Renaming БазаДаних to Database
        Authorization authorization = new Authorization(); // Renaming Авторизація to Authorization

        if (authorization.login(db)) {    // Renaming авторизуватися to authorize
            ReportBuilder reportBuilder = new ReportBuilder(db);  // Assuming ReportBuilder stays as is
        }
    }
}
