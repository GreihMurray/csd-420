package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);

        Circle border = new Circle();
        border.getStyleClass().add("border-circle");
        border.setRadius(30);
        border.setCenterY(120);
        border.setCenterX(35);

        Circle plain = new Circle();
        plain.getStyleClass().add("plain-circle");
        plain.setRadius(30);
        plain.setCenterY(120);
        plain.setCenterX(100);

        Circle red = new Circle();
        red.getStyleClass().add("red-circle");
        red.setRadius(30);
        red.setCenterY(120);
        red.setCenterX(165);

        Circle green = new Circle();
        green.getStyleClass().add("green-circle");
        green.setRadius(30);
        green.setCenterY(120);
        green.setCenterX(230);

        pane.getChildren().add(border);
        pane.getChildren().add(plain);
        pane.getChildren().add(red);
        pane.getChildren().add(green);

        scene.getStylesheets().add(HelloApplication.class.getResource("styles.css").toExternalForm());

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}