/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendamysql;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ideapad 330
 */
public class conexiondao {
    Connection conexion = null;
    List<datosdto>listadatos = new ArrayList<>();
    private void conecta(){
        String user="root";
        String password ="root";
        String url="jdbc:mysql://localhost:3306/4to20201?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexiondao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(conexiondao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inserta(datosdto datos){
        boolean estado= true;
        try{
            conecta();
            PreparedStatement ps= conexion.prepareStatement("insert into datos(nombre,edad,sexo) values (?,?,?)");
            ps.setString(1, datos.getNombre());
            ps.setString(2, datos.getEdad());
            ps.setString(3, datos.getSexo());
            ps.execute();
        }catch(SQLException ex){
            estado = false;
        }finally{
            cerrar();
        }
        return estado;
    }
    
    public boolean cargar(){
        boolean estado = true;
        datosdto datos;
        try{
            PreparedStatement ps = conexion.prepareStatement("select * from datos");
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                datos = new datosdto();
                datos.setId(resultado.getInt("id"));
                datos.setNombre(resultado.getString("nombre"));
                datos.setEdad(resultado.getString("edad"));
                datos.setSexo(resultado.getString("sexo"));
                listadatos.add(datos);
            }
        }catch(SQLException ex){
            estado = false;
        } finally{
            cerrar();
        }
        return estado;
    }
    
    public boolean eliminar(datosdto datos){
        boolean estado = true;
        try{
            PreparedStatement ps= conexion.prepareStatement("delate from datos where id=?");
            ps.setInt(1, datos.getId());
            ps.execute();
    }catch(SQLException ex){
            estado = false;
        }finally{
            cerrar();
        }
        return estado;
    }
    
    public List<datosdto>getdatos(){
        return listadatos;
    }

    public boolean actualiza(){
        boolean estado= true;
        try{
            conecta();
            PreparedStatement ps= conexion.prepareStatement("update datos set nombre =?,edad = ?, sexo=? where id");
            ps.setString(1, datos.getNombre());
            ps.setString(2, datos.getEdad());
            ps.setString(3,datos.getId());
            ps.setInt(4, datos.getId());
            ps.execute();
        }catch(SQLException ex){
            estado = false;
        }finally{
            cerrar();
        }
        return estado;
    }
    
    private void cerrar(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexiondao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
