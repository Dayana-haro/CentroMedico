/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author user
 */
public class PersonaModelo {
   private String CEDULA;              
   private String NOMBRE;              
   private String APELLIDO;
   private String CORREOE;
   private int CELULAR;
   private String TIPOSANGRE;        
   private Date FECHANACIMIENTO;      
   private String DIRRECION;            
   private String GENERO;

    public PersonaModelo() {
    }

    public PersonaModelo(String CEDULA, String NOMBRE, String APELLIDO, String CORREOE, int CELULAR, String TIPOSANGRE, Date FECHANACIMIENTO, String DIRRECION, String GENERO) {
        this.CEDULA = CEDULA;
        this.NOMBRE = NOMBRE;
        this.APELLIDO = APELLIDO;
        this.CORREOE = CORREOE;
        this.CELULAR = CELULAR;
        this.TIPOSANGRE = TIPOSANGRE;
        this.FECHANACIMIENTO = FECHANACIMIENTO;
        this.DIRRECION = DIRRECION;
        this.GENERO = GENERO;
    }

    public String getCEDULA() {
        return CEDULA;
    }

    public void setCEDULA(String CEDULA) {
        this.CEDULA = CEDULA;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO() {
        return APELLIDO;
    }

    public void setAPELLIDO(String APELLIDO) {
        this.APELLIDO = APELLIDO;
    }

    public String getCORREOE() {
        return CORREOE;
    }

    public void setCORREOE(String CORREOE) {
        this.CORREOE = CORREOE;
    }

    public int getCELULAR() {
        return CELULAR;
    }

    public void setCELULAR(int CELULAR) {
        this.CELULAR = CELULAR;
    }

    public String getTIPOSANGRE() {
        return TIPOSANGRE;
    }

    public void setTIPOSANGRE(String TIPOSANGRE) {
        this.TIPOSANGRE = TIPOSANGRE;
    }

    public Date getFECHANACIMIENTO() {
        return FECHANACIMIENTO;
    }

    public void setFECHANACIMIENTO(Date FECHANACIMIENTO) {
        this.FECHANACIMIENTO = FECHANACIMIENTO;
    }

    public String getDIRRECION() {
        return DIRRECION;
    }

    public void setDIRRECION(String DIRRECION) {
        this.DIRRECION = DIRRECION;
    }

    public String getGENERO() {
        return GENERO;
    }

    public void setGENERO(String GENERO) {
        this.GENERO = GENERO;
    }
   
    
}
