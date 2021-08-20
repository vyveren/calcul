package org.openjfx.calc;

import java.io.IOException;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {
   SecondaryController cont;
   private double x=0,y=0;
   private boolean flagx,flagy=false,flagop=false, flagpaint=false;  
   private String op="";
   private int iter=0;

    @FXML
    private TextField tPole;
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void initialize() throws IOException{       
        tPole.setText("0");
        flagx=true;
    }
    
    @FXML
    private void digit(ActionEvent e){
        String dig=((Button)e.getSource()).getText();               
        if (dig.equals("0") && tPole.getText().equals("0"))return;
        if(flagx||flagy){
            tPole.clear();  
            flagx=false;
            flagy=false;
            flagpaint=false;
        }        
        if(dig.equals(".")){
            if(tPole.getText().contains("."))return;
            else if(tPole.getText().equals("0")||tPole.getText().equals(""))
                    dig="0.";
        }                     
        tPole.setText(tPole.getText()+dig);
    }
    @FXML
    private void operator(ActionEvent e){        
        if(flagop && !flagx){flagop=false;ravno(e);}
        op=(((Button)e.getSource()).getText());    
        x=Double.valueOf(tPole.getText());      
        flagx=true;                   
        flagop=true;      
    }    
    @FXML
    public void ravno(ActionEvent e){
        double t=x;
        iter++;
        
        if((((Button)e.getSource()).getText()).equals("=")){
            flagop=false;
        }        
        if(x==0 && "/".equals(op))return;
        if(!flagy){
            y=Double.valueOf(tPole.getText());
            flagy=true;
        }
        switch (op){
            case "+": x=x+y ;
                break;
            case "-": x=x-y ;
                break;
            case "*": x=x*y ;
                break;
            case "/": x=x/y;
                break;   
            case "deg":x=pow(x,y);           
                break;    
        }
         if (x%1==0)
         tPole.setText(String.valueOf((int)x));
         else tPole.setText(String.valueOf(x));
         
        App.setRow(iter,String.valueOf(t),op,String.valueOf(y),String.valueOf(x));
         
    }
    @FXML
    public void clear(){       
        flagop=false;
        flagx=true;
        flagy=false;
        op="";
        x=0;y=0;
        tPole.setText(String.valueOf((int)x));
    }
    @FXML
    public void root(){
        tPole.setText(String.valueOf(sqrt(Double.valueOf(tPole.getText()))));
    }
     @FXML
    public void degree(){
        double temp=Double.valueOf(tPole.getText());
        
    }
}
