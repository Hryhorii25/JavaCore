//package ГрафікаJAVAFX;
//
//import javafx.application.Application;
//import javafx.concurrent.Worker;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.web.WebEngine;
//import javafx.scene.web.WebView;
//import javafx.stage.Stage;
//
////В даній програмі показано приклад роботи з JAVA FX файлом через HTML і JavaStript тобто створення і відображення графічного інтерфейсу
//// і роботу логіки програми через HTML і JavaStript файли
//public class FX12HTMLJavaScript extends Application {
//    public static void main(String[] args) {
//        Application.launch(args);
//
//    }
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        //Блок коду показано як підключати до JAVA FX програми файли HTML і JavaStript
//        WebView webView = new WebView();
//        WebEngine webEngine = webView.getEngine();
//        webEngine.load("");//Даний блок означає підключення із зовнішньго джерела локальний файл на компюторі або файл з мережі
//
//        //Даний блок це прописання роботи графічної програми через HTML і JavaStript код який вводиться напряму
//        webEngine.loadContent(""+"<div id = 'div'> hello world</div>"+"<script>document.getElementById('div')." +
//                "style.color='blue';"+"function changeColor(){"+"document.getElementById('div').style.color='green';"+"}  </script>"+"");
//
//
//
////Даний блок запукає  код
//        webEngine.getLoadWorker().stateProperty().addListener((observable, oldValue, newValue) ->
//        {if (newValue== Worker.State.SUCCEEDED){
//            webEngine.executeScript("changeColor();");//Запуск методу JavaStript
//        }
//        });
//
//
//
//
//
//
//
//        Group group = new Group();
//        group.getChildren().add(webView);
//        group.getChildren().addAll();
//        primaryStage.setScene(new Scene(group,400,400));
//        primaryStage.show();
//    }
//
//
//}
//
//
