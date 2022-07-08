//package ГрафікаJAVAFX;
//
//import javafx.application.Application;
//import javafx.concurrent.Task;
//import javafx.concurrent.WorkerStateEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//
////В даному прикладі показано роботу потоків у JAVA FX програмах. Потоки тут потрібні для взаємодії FX програми з іншими прграмами
//public class FX15ПотокиJAVAFX extends Application {
//    public static void main(String[] args) {
//        Application.launch(args);
//
//    }
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        MyService myService = new MyService();
//        myService.setOnSucceeded(new EventHandler <WorkerStateEvent>(){
//            @Override
//            public void  handle (WorkerStateEvent t){
//                System.out.println("done "+ t.getSource().getValue());
//            }
//        });
//        myService.start();
//
//        Group group = new Group();
//
//        primaryStage.setScene(new Scene(group,400,400));
//        primaryStage.show();
//
//
//
//
//    }
//
//
//    static class MyService extends javafx.concurrent.Service<String>{
//
//    @Override
//    protected Task<String> createTask() {
//        return new Task<String>() {
//            @Override
//            protected String call() throws Exception {
//                return "hello world";
//            }
//        };
//    }
//}
//}
//
