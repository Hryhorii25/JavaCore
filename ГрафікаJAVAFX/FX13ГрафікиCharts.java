//package ГрафікаJAVAFX;
//
//import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.chart.PieChart;
//import javafx.stage.Stage;
//
//
//
////Створення графіків
//public class FX13ГрафікиCharts extends Application {
//    public static void main(String[] args) {
//        Application.launch(args);
//
//    }
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        ObservableList<PieChart.Data> data = FXCollections.observableArrayList(
//                new PieChart.Data("Grapefruit",12),
//                new PieChart.Data("Oranges",25),
//                new PieChart.Data("Plums",10),
//                new PieChart.Data("Pears",22),
//                new PieChart.Data("Apples",30));
//
//PieChart chart = new PieChart(data);
//chart.setTitle("product");
//
//
//
//        Group group = new Group();
//        group.getChildren().addAll(chart);
//        primaryStage.setScene(new Scene(group,400,400));
//        primaryStage.show();
//    }
//}
//
