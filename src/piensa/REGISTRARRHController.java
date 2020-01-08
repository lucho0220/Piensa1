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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lucho Pro
 */
public class REGISTRARRHController implements Initializable {

    @FXML
    private Button btnprofesional;
    @FXML
    private Button btnpsico;
    @FXML
    private TextField txt_nombre;
    @FXML
    private TextField txtci;
    @FXML
    private TextField txt_puesto;
    @FXML
    private Button txtsave;
    @FXML
    private Button btnregresar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void profe(ActionEvent event) {
    }

    @FXML
    private void psico(ActionEvent event) {
    }

    @FXML
    private void save(ActionEvent event) {
    }

    @FXML
    private void regresar(ActionEvent event) {
        try {
              Node node =(Node) event.getSource();
                    Stage stage= (Stage) node.getScene().getWindow();
                    stage.close();

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("MenuRH.fxml"));

            Parent root2 = (Parent) loader1.load();
            Stage stage1 = new Stage();
            stage1.setTitle("Vitefama");
            stage1.setScene(new Scene(root2));
            stage1.show();
            stage1.setResizable(false);

        } catch (IOException e) {
            System.out.println("error al abrir");
        }

    }

    @FXML
    private void volver(MouseEvent event) {
    }

}
