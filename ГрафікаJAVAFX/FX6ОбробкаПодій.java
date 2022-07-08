//package ГрафікаJAVAFX;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.HBox;
//import javafx.stage.Stage;
//
////В даній програмі показано обробку подій нажаття на компонент
//public class FX6ОбробкаПодій extends Application {
//    public static void main(String[] args) {
//        Application.launch(args);
//
//    }
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//       Button button = new  Button("press");
//
//      //1)Перший спосіб
//       button.setOnMouseClicked(new EventHandler<MouseEvent>() {
//           @Override
//           public void handle(MouseEvent event) {
//
//
//           }
//       });
////2)Другий спосіб
//       button.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
//    @Override
//    public void handle(ActionEvent event) {
//        System.out.println("event hendler ");
//
//    }
//});
//
//
//
//        Group group = new Group();
//        primaryStage.setScene(new Scene(group,400,400));
//        primaryStage.show();
//    }
//}
//
