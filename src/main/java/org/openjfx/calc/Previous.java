package org.openjfx.calc;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Previous {
    private final SimpleIntegerProperty col1 =new SimpleIntegerProperty();
    private final SimpleStringProperty col2 = new SimpleStringProperty("");
    private final SimpleStringProperty col3 = new SimpleStringProperty("");
    private final SimpleStringProperty col4 = new SimpleStringProperty("");   
    private final SimpleStringProperty col5 = new SimpleStringProperty("");
    public Previous(){
        this (0,"","","","");
    }
    public Previous (int c1, String c2, String c3, String c4, String c5){
        setCol1(c1);
        setCol2(c2);
        setCol3(c3);
        setCol4(c4);
        setCol5(c5);
    }
    public void  setCol1 (int c1){col1.set(c1);}
    public int getCol1(){return col1.get();}
    public void setCol2(String c2){col2.set(c2);}
    public String getCol2(){return col2.get();}
    public void setCol3(String c3){ col3.set(c3); }
    public String getCol3(){ return col3.get(); }
    public void setCol4(String c4){ col4.set(c4); }
    public String getCol4(){ return  col4.get(); }
    public void setCol5(String c5){ col5.set(c5); }
    public String getCol5(){ return col5.get(); }
}


