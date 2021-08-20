package org.openjfx.calc;

import java.io.IOException;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class SecondaryController {
    @FXML
    private TableView<Previous> table;
   //int i=0;
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
     @FXML
    public void addRow(int n,String A,String op,String B, String res){             
        ObservableList<Previous> data = table.getItems();
        data.add(new Previous(n,A,op,B,res));
    }
    
   
      @FXML
    private void initialize() throws IOException{
        ObservableList<Previous> data=App.get();   
        ObservableList<Previous> tdat = table.getItems();
        System.out.println(data.size());
        for(int i=data.size();i>0;i--){
            tdat.add(data.get(i-1));
        }
    }
    
    @FXML
    private void hendadd(){
       
       // addRow(i,"a","s","d","f");
        //i++;
    }
    
}