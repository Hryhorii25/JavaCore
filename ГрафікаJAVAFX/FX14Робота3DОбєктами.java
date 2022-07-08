//package ГрафікаJAVAFX;
//
//import javafx.application.Application;
//import javafx.scene.*;
//import javafx.scene.paint.Color;
//import javafx.scene.paint.PhongMaterial;
//import javafx.scene.shape.Cylinder;
//import javafx.scene.transform.Rotate;
//import javafx.stage.Stage;
//
////Робота з 3D моделями
//public class FX14Робота3DОбєктами extends Application {
//    public static void main(String[] args) {
//        Application.launch(args);
//
//    }
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//
//
//        Camera camera = new PerspectiveCamera(true);
//        camera.setFarClip(50000.0);
//        camera.setTranslateZ(-1000);
//
//
//        Cylinder cylinder =  new Cylinder(100,300);
//        PhongMaterial blueMaterial = new PhongMaterial();
//        blueMaterial.setDiffuseColor(Color.DARKBLUE);
//        blueMaterial.setDiffuseColor(Color.BLUE);
//        cylinder.setMaterial(blueMaterial);
//
//        cylinder.setRotationAxis(Rotate.X_AXIS);
//        cylinder.setRotate(45);
//
//
//
//        Group group = new Group();
//        group.getChildren().addAll(cylinder);
//        Scene scene = new Scene(group, 400,300);
//        scene.setCamera(camera);
//        primaryStage.setScene(scene);
//
//        primaryStage.show();
//    }
//}
//
