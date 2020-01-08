
package piensa;

import conexion.ConnectionUtil;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


public class AgregarusuarioController implements Initializable {

    @FXML
    private Button btnregresar;
    @FXML
    private TextField txt_celular;
    @FXML
    private Button btnguardar;
    @FXML
    private TextField txt_nombre;
    private TextField txt_ci;
    @FXML
    private TextField txt_mail;
    @FXML
    private TextField txt_usuario;
    @FXML
    private PasswordField txt_contraseña;
    @FXML
    private TextField txt_tipo;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void retornar(ActionEvent event)  {
        try {
              Node node =(Node) event.getSource();
                    Stage stage= (Stage) node.getScene().getWindow();
                    stage.close();
             FXMLLoader loader= new FXMLLoader(getClass().getResource("Menu.fxml"));
            
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
    private void celular(ActionEvent event) {
    }
    
    public AgregarusuarioController() {
        con = ConnectionUtil.conDB();
    }
     
    Connection con = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    @FXML
    private void guardar(ActionEvent event) {

         try {
            
            preparedStatement=con.prepareStatement("insert into usuarios values (?,?,?,?,?,?,?)");
            preparedStatement.setString(1,null);
            preparedStatement.setString(2,txt_nombre.getText().trim());
            preparedStatement.setString(3, txt_celular.getText().trim());
            preparedStatement.setString(4, txt_mail.getText().trim());
            preparedStatement.setString(5, txt_usuario.getText().trim());
            preparedStatement.setString(6, txt_contraseña.getText().trim());
            preparedStatement.setString(7, txt_tipo.getText().trim());
            
            preparedStatement.executeUpdate();
            txt_nombre.setText("");
            txt_celular.setText("");
            txt_mail.setText("");
            txt_usuario.setText("");
            txt_contraseña.setText("");
            txt_tipo.setText("");
            
            JOptionPane.showMessageDialog(null,"Datos grabados en la base de datos");
            
                 
        } catch (Exception e) {
               JOptionPane.showMessageDialog(null,"Datos no grabados en la base de datos");
        }  
                    
    }

    @FXML
    private void nom(ActionEvent event) {
    }


    @FXML
    private void mail(ActionEvent event) {
    }

    @FXML
    private void usua(ActionEvent event) {
    }

    @FXML
    private void contraseña(ActionEvent event) {
    }

    @FXML
    private void tipo(ActionEvent event) {
    }
    
}
