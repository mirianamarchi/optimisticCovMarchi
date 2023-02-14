module it.marchimiriana.optimisticcoverage {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.marchimiriana.optimisticcoverage to javafx.fxml;
    exports it.marchimiriana.optimisticcoverage;
}