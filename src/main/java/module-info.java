module com.example.bankapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.example.bankapp to javafx.fxml;
    exports com.example.bankapp;
    exports com.example.bankapp.Controllers;
    exports com.example.bankapp.Controllers.Admin;
    exports com.example.bankapp.Controllers.Client;
    exports com.example.bankapp.Models;
    exports com.example.bankapp.Views;
}