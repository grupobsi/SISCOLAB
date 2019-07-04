/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.cruds;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author phantom
 */
public abstract class PostgresConn {
    private final String user;

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getConnString() {
        return connString;
    }
    private final String pass;
    private final String connString;
    private Connection conn = null;

    public Connection getConn() {
        return conn;
    }
    
    public PostgresConn(String connString, String user, String pass) throws SQLException {
        this.user = user;
        this.pass = pass;
        this.connString = connString;
    }
    
    public void conectar() throws SQLException {
        if(this.conn != null && !this.conn.isClosed()){
            return;
        }
        this.conn = this.conn = DriverManager.getConnection(this.connString, this.user, this.pass);    
    }
    
    public void fechar() throws SQLException {
        this.conn.close();
    }
}
