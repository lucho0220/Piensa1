/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piensa;

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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lucho Pro
 */

public class MenuRHController implements Initializable {
public int var=2;

    @FXML
    private Button btnentrevista;
    @FXML
    private Button btninformes;
    @FXML
    private Button btnregistra;
    @FXML
    private Button btnsalir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void entrevista(ActionEvent event) {
    }

    @FXML
    private void informes(ActionEvent event) {
    }

    @FXML
    private void registra(ActionEvent event) {
          try {
                Node node =(Node) event.getSource();
                    Stage stage= (Stage) node.getScene().getWindow();
                    stage.close();
             FXMLLoader loader= new FXMLLoader(getClass().getResource("REGISTRARRH.fxml"));
            
    Parent root1=(Parent) loader.load();
   stage.setTitle("Vitefama");
   stage.setScene(new Scene(root1));
   stage.show();
   stage.setResizable(false);
    
        } catch (Exception e) {
            System.out.println("error al abrir");
        }

    }

    @FXML
    private void salir(ActionEvent event) {
        
    }
    
    }
    
    

