package org.openjfx.calc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.ModuleLayer.Controller;
import javafx.collections.ObservableList;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    public static List list;
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 250, 300);
        list=new List();       
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Калькулятор");
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        Parent pare=loadFXML(fxml); 
        scene.setRoot(pare);
    }
     static void setRow(int i,String a,String op,String b,String res){
         list.pop(i,a,op,b,res);
     }
    static ObservableList<Previous> get(){
       return list.getList();
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));        
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}