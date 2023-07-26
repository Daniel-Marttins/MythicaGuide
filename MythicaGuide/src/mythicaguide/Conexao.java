/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mythicaguide;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */


public class Conexao {
    
    public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
        
        // CONEXÃO BANCO DE DADOS VIA ARQUIVO .INI
        
        /*String raizDiretorio = System.getProperty("user.dir");
        String arquiviIni = raizDiretorio+"\\src\\mythicaguide\\config\\myguide.ini";  
        
        Properties dadosIni = new Properties();
        
        try {
            dadosIni.load(new FileReader(arquiviIni));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        
        
        String host = dadosIni.getProperty("host");
        String port = dadosIni.getProperty("port");
        String username = dadosIni.getProperty("username");
        String password = dadosIni.getProperty("password");
        String databaseName = dadosIni.getProperty("database_name");

        String url = "jdbc:mysql://" + host + ":" + port + "/" + databaseName;*/
        
        //CONEXÃO COM BANCO DE DADOS VIA RAILWAY
        
        String url = "jdbc:mysql://containers-us-west-55.railway.app:6678/railway";
        String usuario = "root";
        String senha = "W9wJR2a5rkSiX2WyZfj3";

        
        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            
            Main menuInicial = new Main(conexao);
            menuInicial.setVisible(true);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar ao banco de dados!");
        }
    }
    
}
