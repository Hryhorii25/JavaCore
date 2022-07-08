package ГрафікаJAVAFX;

//В даній програмі показано роботу спеціальної графічної програми Scene Builder для JAVA FX за допомогою неї можна створювати графічні десктопні
// програми додавати компоненти і задавати їм характеристики тобто створювати інтерфейс програми дана програма спрощує створення графічнийх інтерфейсів

//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Group;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;
//import javafx.stage.Stage;
//
////Для того що створити графічний інтефейс і звязати його з кодом потрібно створений графічний інтерефейс створений у Scene Builder зберегти у папці src або
//// прямо у пакеті з класами після цього можна відкривати програмну кодову версію (fxml) даного графічного інтерфейса в якому можна прописувати граф інтерфейс кодом
//public class FX9SceneBuilder extends Application {
//    public static void main(String[] args) {Application.launch(args);
//
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Group group = new Group();
//        Scene scene = new Scene( group,400,400);
//
//       //Даний блок коду показує як підключати створений графічний інтерфейс Scene Builder до проекту
//        Parent content = FXMLLoader.load(getClass().getResource("myFormSceneBuilder.fxml"));
//        BorderPane borderPane = new BorderPane();
//        borderPane.setCenter(content);
//        group.getChildren().add(borderPane);
/////
//        primaryStage.setTitle("myFormSceneBuilder");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//
//    }
//}
//
//
//
