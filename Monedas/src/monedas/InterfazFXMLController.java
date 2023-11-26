
package monedas;

import Recursos.Conversion;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import Recursos.TipoCambio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javafx.scene.input.KeyEvent;
import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author migue
 */
public class InterfazFXMLController implements Initializable {

    String value1, value2;
    @FXML
    private TextField txt1;
    @FXML
    private TextField txt2;
    @FXML
    private ComboBox cbx1;
    @FXML
    private ComboBox cbx2;
    @FXML
    private Label lbl1;
    @FXML
    private Label lbl2;
    @FXML
    private Label lbl3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> lista =FXCollections.observableArrayList("Dolar estadounidense","Peso Méxicano","Euro");
        ObservableList<String> lista2 =FXCollections.observableArrayList("Dolar estadounidense","Peso Méxicano","Euro");
        cbx1.setItems(lista);
        cbx1.setEditable(false);
        cbx2.setItems(lista2);
        cbx2.setEditable(false);
        lbl2.setVisible(false);
        lbl3.setVisible(false);
        txt2.setEditable(false);

        
    }    

    @FXML
    private void Escritura1(ActionEvent event) {
    }

    @FXML
    private void Escritura2(ActionEvent event) {
    }

    @FXML
    private void eleccion1(ActionEvent event) {
        
        value1=cbx1.getSelectionModel().getSelectedItem().toString();
        //value2=cbx2.getSelectionModel().getSelectedItem().toString();
    }

    @FXML
    private void eleccion2(ActionEvent event) {
        Conversion C=new Conversion();
        llamado(C);

    }


    @FXML
    private void Press1(KeyEvent event) {
        Conversion C=new Conversion();
        if(txt1.getText().equals("")||txt1.getText().equals(" "))
        {
            txt2.setText("");
        }
        else
        {
            llamado(C);
        }    
    }

    @FXML
    private void Press1_2(KeyEvent event) {
        Conversion C=new Conversion();
        if(txt1.getText().equals("")||txt1.getText().equals(" "))
        {
            txt2.setText("");
        }
        else
        {
            llamado(C);
        }                  
    }
    
    public void llamado (Conversion C)
    {
        try {
        double numero = Double.parseDouble(txt1.getText());    
        value1 = cbx1.getSelectionModel().getSelectedItem().toString();
        value2 = cbx2.getSelectionModel().getSelectedItem().toString();
        if ((value1 == null || value2 == null) && numero>=0) 
        {
            throw new NullPointerException();
        }
        lbl1.setText(value2);           
            switch(value1)
            {
                case "Dolar estadounidense":
                    txt2.setText(C.USD(value2, numero));

                    break; 
                case "Peso Méxicano":
                    txt2.setText(C.MXN(value2, numero));
                    break;            
                case "Euro":
                    txt2.setText(C.EUR(value2, numero));
                    break;        
            }
        lbl2.setVisible(false);
        lbl3.setVisible(false);
        } catch (NullPointerException e) 
        {
        lbl3.setVisible(true);
        } catch(NumberFormatException e)   
        {
          txt2.setText("");
          lbl2.setVisible(true);
        }   
    }
    
}
    
    
    

