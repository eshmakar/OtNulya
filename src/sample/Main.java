package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Тест на скорость процессора");
        primaryStage.setScene(new Scene(root, 650, 270));
        primaryStage.setMinHeight(270);
        primaryStage.setMinWidth(650);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
