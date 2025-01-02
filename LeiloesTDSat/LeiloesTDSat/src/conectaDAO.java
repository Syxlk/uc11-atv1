
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class conectaDAO {
    
    public Connection connectDB(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/uc11?serverTimezone=America/Sao_Paulo";
            String user = "root";
            String password = "QqEeSs113wAd2#";
            conn = DriverManager.getConnection(url, user, password);
            return conn;
            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO: " + e.getMessage());
            return null;
        }
        
    }
    
}
