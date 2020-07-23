/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author w7
 */
public class OtratiendaController implements Initializable {

    @FXML
    private AnchorPane AnchorPaneTienda;
    @FXML
    private Button btnLlamar;
    public static Button addLLamar;
    public static String[] arrButtons;
    public static Pane anchorDouble;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //inicializar aca y gaurdar como variable general el fxmlloader
        addLLamar = btnLlamar;
        anchorDouble = AnchorPaneTienda;
    }

    @FXML
    private void btnClicked(MouseEvent event) {
        if (event.getSource().equals(btnLlamar)) {
            Node nodo;
            try {
                FXMLLoader fxml = new FXMLLoader(getClass().getResource("item.fxml"));
                nodo = fxml.load();
                FXMLDocumentController.panel2.getChildren().add(nodo);
                ItemController.setName(btnLlamar.getText());
                deshabilitar(true);
                

            } catch (IOException ex) {
                Logger.getLogger(OtratiendaController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private void guardarNodos(Node btn) {

    }

    private void deshabilitar(boolean b) {
        btnLlamar.setDisable(b);
    }
}
