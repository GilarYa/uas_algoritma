import java.sql.DriverManager;

public class Koneksi {
   private static java.sql.Connection koneksi;
    
   
    public static java.sql.Connection getKoneksi(){
        if (koneksi == null){
            try {
                String url = "jdbc:mysql://127.0.0.1:3306/gf_1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Berhasil Terhubung");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        return koneksi;
    }
    public static void main(String args[]){
        getKoneksi();
    }
    
}
/**import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Koneksi {
    public static Boolean register(String id,String kunci) throws SQLException {
        String DB_URI = "jdbc:mysql://127.0.0.1:3306/gf_1";
        String DB_USER = "root";
        String DB_PASSWORD = "";
        
        Connection con = DriverManager.getConnection(DB_URI, DB_USER, DB_PASSWORD);
        if ("".equals(id) ||
                "".equals(kunci)){
            
        }
        String sql = "INSERT INTO kunciq (id, kunci) values ('" + id + "', '" + kunci + "')";
        Statement stat = con.createStatement();
        System.out.println("Berhasil Terhubung");
        
        
        stat.execute(sql);
        
        return true;
    }
public class bee extends Actor
{
    
        public void jalan(){
        if(Greenfoot.isKeyDown("")){
            setLocation(getX()+5, getY());
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+5);
        }
    }
}
}*/
