/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.PersonaModelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class PersonaControlador {
    private PersonaModelo persona;
    Conexion conectar =new Conexion();
    Connection conectado = (Connection)conectar.conectar();
    PreparateStament ejecutar;
    ResultSet resultado;
    int res;

    public PersonaControlador() {
    }

    public PersonaModelo getPersona() {
        return persona;
    }

    public void setPersona(PersonaModelo persona) {
        this.persona = persona;
    }

    public void crearPersona (PersonaModelo p){
        try{
                        
            String SQL="call sp_CrearPersona('"+p.getCEDULA()+"',"
                    + "'"+p.getNOMBRE()+"',"
                    + "'"+p.getAPELLIDO()+"','"
                    +p.getCELULAR()+"',"
                    + "'"+p.getTIPOSANGRE()+"'"
                    + "'"+p.getFECHANACIMIENTO()+"'"
                    + "'"+p.getDIRRECION()+"'"
                    + "'"+p.getGENERO()+"'"
                    +")";
            ejecutar = (PreparateStament)conectado.prepareCall(SQL);
            resultado= ejecutar.executeQuery();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Persona creada con exito");
            }else{
                JOptionPane.showMessageDialog(null, "Revisar los datos ingresados");
            }      
           ejecutar.close();
        }catch(SQLException e){
            
        }
    } 
}
