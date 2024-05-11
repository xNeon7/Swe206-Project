package com.example.swe206project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class ProjectApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ProjectApplication.class.getResource("SWE206-Project.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 700);
        stage.setTitle("KFUPM Reservations");
        stage.setScene(scene);
        stage.show();
}
    public static void main(String[] args) {
        launch();
    }
}
