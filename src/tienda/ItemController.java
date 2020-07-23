/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import static tienda.OtratiendaController.arrButtons;

/**
 * FXML Controller class
 *
 * @author w7
 */
public class ItemController implements Initializable {

    @FXML
    private Button btnPress;
    @FXML
    private Pane itemPane;

    public static Button btn;
    public static Pane paneItem;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //System.out.println("hola ruben no te preocues encontraras ese problema");
        btn = btnPress;
        paneItem = itemPane;
    }

    @FXML
    private void habla(ActionEvent event) {
        //CUANDO PRESIONE BOTON1 SE DEBE HABILITAR EL BOTON IGUAL AL QUE SE PRESIONO
        if (event.getSource().equals(btnPress)) {
            FXMLDocumentController.panel2.getChildren().remove(itemPane);
            AnchorPane[] ap = new AnchorPane[FXMLDocumentController.doubleBox.getChildren().size()];
            for (int i = 0; i < ap.length; i++) {
                ap[i] = (AnchorPane)FXMLDocumentController.doubleBox.getChildren().get(i);
                Button ss = (Button)ap[i].getChildren().get(0);
                if (ss.getText().equals(btnPress.getText())) {
                    ss.setDisable(false);
                }
            }
        }
    }

    public static void setName(String value) {
        btn.setText(value);
    }

}
