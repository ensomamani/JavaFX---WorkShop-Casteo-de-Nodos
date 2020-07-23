/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 *
 * @author w7
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private Pane panel;
    @FXML
    private Pane otropane;
    
    //si quieres utilizar un nodo padre y enviarlo a otra clase para que desde ahi se agrege
    //debes crear una variable igual a lo que quieres enviar a la otra clase 
    //y de tipo static y debes inicializarlas en initialize cuando se ejecuta el programa
    public static FlowPane panel2;
    @FXML
    private FlowPane flowItem;
    @FXML
    private HBox hboxAdd;
    public static HBox doubleBox;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        panel2 = flowItem;
        doubleBox = hboxAdd;
        try {
            Node[] n = new Node[5];
            for (int i = 0; i < n.length; i++) {
                FXMLLoader fx = new FXMLLoader(getClass().getResource("otratienda.fxml"));
                n[i] = fx.load();
                hboxAdd.getChildren().add(n[i]);
                OtratiendaController.addLLamar.setText("Boton" + (i+1));
            }
            
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
