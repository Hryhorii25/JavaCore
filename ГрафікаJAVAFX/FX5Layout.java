//package ГрафікаJAVAFX;
//
//import javafx.application.Application;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.HBox;
//import javafx.stage.Stage;
//
////Layout так як в Swing i AWT  це механізм розміщення елементів у графічному вукні
//public class FX5Layout extends Application {
//    public static void main(String[] args) {
//        Application.launch(args);
//
//    }
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        BorderPane borderPane = new BorderPane();
//        borderPane.setBottom(new Button("press"));
//        HBox box = new HBox(new Button());
//        box.getChildren().addAll(new Button("one"),new Button("two"));
//
//
//
//
//
//        Group group = new Group();
//        group.getChildren().addAll(borderPane,box);
//        primaryStage.setScene(new Scene(group,400,400));
//        primaryStage.show();
//    }
//}
//
