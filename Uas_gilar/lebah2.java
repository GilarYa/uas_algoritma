import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class lebah2 extends Actor
{
    /**
     * Act - do whatever the lebah2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 public void act(String kunci) throws SQLException {
        Connection a = Koneksi.getKoneksi();
        Statement b = a.createStatement();
        
        String sql = "SELECT * FROM kunciq WHERE kunci = '" + kunci + "'";
        
        ResultSet w = b.executeQuery(sql);
        if (w.next()) 
        {
         if(Greenfoot.isKeyDown(w.getString("kunci"))){
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(),getY()+2);
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-2,getY());
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+2,getY());
        }
    }
}
}
