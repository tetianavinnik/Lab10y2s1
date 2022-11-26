package org.example.adapter;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorisation authorisation = new Authorisation();
        if (authorisation.authorise(db)) {
            ReportBuilder br = new ReportBuilder((DataBase) db);
        }
    }
}
