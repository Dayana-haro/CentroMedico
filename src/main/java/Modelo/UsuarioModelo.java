/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author user
 */
public class UsuarioModelo  extends PersonasModelo{
    private String usuario;
    private String clave;
    private String pregunataseguridad;

    public UsuarioModelo() {
    }

    public UsuarioModelo(String usuario, String clave, String pregunataseguridad) {
        this.usuario = usuario;
        this.clave = clave;
        this.pregunataseguridad = pregunataseguridad;
    }

    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPregunataseguridad() {
        return pregunataseguridad;
    }

    public void setPregunataseguridad(String pregunataseguridad) {
        this.pregunataseguridad = pregunataseguridad;
    }
    
    
}
