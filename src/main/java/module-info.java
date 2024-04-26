module com.example.recipeapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.recipeapp to javafx.fxml;
    exports com.example.recipeapp;
}