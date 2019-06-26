/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.cruds;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.lang.UnsupportedOperationException;
/**
 *
 * @author phantom
 */
public abstract class PostgresConn {
    private final String user;
    private final String pass;
    private final String connString;
    private Connection conn = null;
    
    public PostgresConn(String connString, String user, String pass) throws SQLException {
        this.user = user;
        this.pass = pass;
        this.connString = connString;
    }
    
    public void conectar() throws SQLException {
        if(this.conn == null) {
            this.conn = DriverManager.getConnection(this.connString, this.user, this.pass);
        } else if(!this.conn.isClosed()){
            this.conn.close();
            this.conn = DriverManager.getConnection(this.connString, this.user, this.pass);
        }
            
    }
    
    public void fechar() throws SQLException {
        this.conn.close();
    }
}
