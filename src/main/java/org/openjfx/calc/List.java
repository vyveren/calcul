package org.openjfx.calc;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class List {      
    ObservableList<Previous> data=FXCollections.observableArrayList();
    public  void pop(int i,String a,String op,String b,String res){
        data.add(new Previous(i,a,op,b,res));
    }
    public ObservableList<Previous> getList(){
        return data;
    }
}
