
package piensa;

import conexion.ConnectionUtil;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javax.swing.JOptionPane;



public class FXMLVistaController implements Initializable {
     
    
    @FXML
    private Button button;
    @FXML
    private Button btnexit;
    @FXML
    private TextField txt_usuario;
    @FXML
    private PasswordField txt_contraseña;
    
    @FXML
    private Label lblerror;
    
    
    
    @FXML
    private void handleButtonAction(MouseEvent event) {

        if (event.getSource() == button) {
            if (login().equals("Admin")) {
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

            else if (login().equals("normal")) {
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
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
     public FXMLVistaController() {
        con = ConnectionUtil.conDB();
    }
     
    Connection con = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    
      public String login() {
        String email = txt_usuario.getText();
        String password = txt_contraseña.getText();

        String sql = "select tipo_user from usuarios where username=? && contraseña=?";

        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();

            
            if(resultSet.next()) {
                
                String tipo=resultSet.getString("tipo_user");
                if(tipo.equalsIgnoreCase("Administrador")){
             
                lblerror.setTextFill(Color.WHITE);
                lblerror.setText("Acceso correcto.. redireccionando");
                return "Admin";
                }
                else if(tipo.equalsIgnoreCase("RRHH")){
                lblerror.setTextFill(Color.WHITE);
                lblerror.setText("Acceso correcto.. redireccionando");
                return "normal";
                
                }
                return "vale";
            }else{
                
                lblerror.setTextFill(Color.BLACK);
                lblerror.setText("Ingrese correctamente el usuario/contreseña");
                return "Error";
            } 
        } catch (SQLException ex) {
            Logger.getLogger(FXMLVistaController.class.getName()).log(Level.SEVERE, null, ex);
        return "Exception";
        }

    }
    @FXML
    private void exit(MouseEvent event) {
         int num;
        num =JOptionPane.showConfirmDialog(null,"¿Desea salir del sistema?","Salida del sistema",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(num==0){
            System.exit(0);}
    }                    
    }
    

