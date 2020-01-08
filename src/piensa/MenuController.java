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
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Lucho Pro
 */
public class MenuController implements Initializable {
    
    public int va=1;

    @FXML
    private Button btnagergar;
    @FXML
    private Button btnentrevistar;
    @FXML
    private Button btninforme;
    @FXML
    private Button btnregistrar;
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
    private void agegar(ActionEvent event) {
         try {
               Node node =(Node) event.getSource();
                    Stage stage= (Stage) node.getScene().getWindow();
                    stage.close();
             FXMLLoader loader= new FXMLLoader(getClass().getResource("Agregarusuario.fxml"));
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
    private void entrevistar(ActionEvent event) {
    }

    @FXML
    private void informe(ActionEvent event) {
    }

    @FXML
    private void registrar(ActionEvent event) {
        try {
            Node node =(Node) event.getSource();
                    Stage stage= (Stage) node.getScene().getWindow();
                    stage.close();
             FXMLLoader loader= new FXMLLoader(getClass().getResource("REGISTRAR.fxml"));
    Parent root1=(Parent) loader.load();
  
   stage.setTitle("sal");
   stage.setScene(new Scene(root1));
   stage.show();
   
    stage.setResizable(false);
        } catch (Exception e) {
            System.out.println("error al abrir");
        }

    }

    @FXML
    private void salir(ActionEvent event) {
          int num;
        num =JOptionPane.showConfirmDialog(null,"¿Desea salir del sistema?","Salida del sistema",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(num==0){
            System.exit(0);}
    }                   
         @FXML
    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }
    

