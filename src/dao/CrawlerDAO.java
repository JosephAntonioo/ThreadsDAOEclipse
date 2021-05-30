package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import javax.swing.JOptionPane;

import connection.DBC;
import model.CrawlerModel;

public class CrawlerDAO {
    public void create(CrawlerModel crawler) throws ClassNotFoundException{

        Connection con = DBC.getConnection();
        PreparedStatement stnt = null;

        try{
            stnt = con.prepareStatement("INSERT INTO Crawler (data, cidade, confirmado, confirmado100k, obito, obito100k, estado) VALUES(?, ?, ?, ?, ?, ?, ?)");
            stnt.setString(1, crawler.getData());
            stnt.setString(2, crawler.getCidade());
            stnt.setString(3, crawler.getConfirmado());
            stnt.setString(4, crawler.getConfirmado100k());
            stnt.setString(5, crawler.getObito());
            stnt.setString(6, crawler.getObito100k());
            stnt.setString(7, crawler.getEstado());

            stnt.executeUpdate();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
        } finally{
        	//JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            DBC.closeConnection(con, stnt);
        }

    }
}