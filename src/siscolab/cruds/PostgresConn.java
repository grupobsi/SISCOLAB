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
/**
 *
 * @author phantom
 * @param <Classe>
 */
public class PostgresConn <Classe> {
    private final String user;
    private final String pass;
    private final String connString;
    
    public PostgresConn(String connString, String user, String pass) throws Exception {
        this.user = user;
        this.pass = pass;
        this.connString = connString;
        
        Connection conn;
        Statement stmt;
    
        conn = DriverManager.getConnection(this.connString, this.user, this.pass);
        conn.close();
    }
    
    public void executeQuery(ICrud c, String query) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        Connection conn;
        Statement stmt;
    
        conn = DriverManager.getConnection(this.connString, this.user, this.pass);
        stmt = conn.createStatement();
        stmt.executeUpdate(query);
        stmt.close();
        conn.close();
    }
    
    public void criar(ICrud c) throws SQLException, ClassNotFoundException {
        executeQuery(c, c.crudCriar());
    }
    
    public void ler(ICrud c) throws SQLException, ClassNotFoundException {
        executeQuery(c, c.crudLer());
    }
    
    public void atualizar(ICrud c, String v) throws SQLException, ClassNotFoundException {
        executeQuery(c, c.crudAtualizar(v));
    }
    
    public void remover(ICrud c) throws SQLException, ClassNotFoundException {
        executeQuery(c, c.crudRemover());
    }
}
