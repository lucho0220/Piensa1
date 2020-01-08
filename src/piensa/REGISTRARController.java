/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piensa;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lucho Pro
 */
public class REGISTRARController implements Initializable {

    @FXML
    private Button btnvolver;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    @FXML
    private void volver(ActionEvent event) {

              try {
               Node node =(Node) event.getSource();
                    Stage stage= (Stage) node.getScene().getWindow();
                    stage.close();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));

    Parent root1=(Parent) loader.load();
   stage.setTitle("Vitefama");
   stage.setScene(new Scene(root1));
   stage.show();
   stage.setResizable(false);

            } catch (IOException e) {
                System.out.println("error al abrir");
            }
              
         
             
    }
    
    
         
    
}
