//package ГрафікаJAVAFX;
//
//import javafx.application.Application;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.HBox;
//import javafx.stage.Stage;
//
////В данйій програмі показако приклад налаштування стилів графічних програм JAVA FX налаштування стилів відбувається за допомогою CSS
//// файлів у яких і запрограмовується стиль дані файли можна качати готові з створеними стилями і підключати до своєї програми або
//// створювати власний стиль
//public class FX10CSS extends Application {
//    public static void main(String[] args) {
//     launch(args);
//
//    }
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//
////Даний блок коду піключає CSS файл стилю при такім підключенні усі інші файли стилю які дані за замовчування будуть відключені
//       // Application.setUserAgentStylesheet(getClass().getResource("myCSS.css").toExternalForm());
////
//        Button button = new Button("test");
//
//
//
//
//
//////Даний блок коду піключає CSS файл стилю при такім підключенні інші стилі зберігаються
//        Group group = new Group();
//        Scene scene = new Scene(group,400,400);
//       scene.getStylesheets().add(getClass().getResource("myCSS.css").toExternalForm());
//        group.getChildren().addAll(button);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//
//
//    }
//}
//
