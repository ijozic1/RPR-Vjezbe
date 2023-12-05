//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ba.unsa.etf.rpr.tutorijal06;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public Main() {
    }

    public void start(Stage primaryStage) throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("/fxml/digitron.fxml"));
        primaryStage.setTitle("Digitron");
        primaryStage.setScene(new Scene(root, 400.0, 400.0));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

