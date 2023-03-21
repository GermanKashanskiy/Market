module com.gitipi.yangomarket {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.gitipi.yangomarket to javafx.fxml;
    exports com.gitipi.yangomarket;
    exports com.gitipi.yangomarket.dataBase;
    opens com.gitipi.yangomarket.dataBase to javafx.fxml;
}