/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author tutut
 */
public class PacientesModelo extends PersonasModelo{
    private int idpaciente;
    private String alergias;
    private String medicamentos;
    private String enfermedades;
    
    public PacientesModelo() {
    }

    public PacientesModelo(int idpaciente, String alergias, String medicamentos, String enfermedades) {
        this.idpaciente = idpaciente;
        this.alergias = alergias;
        this.medicamentos = medicamentos;
        this.enfermedades = enfermedades;
    }

    public PacientesModelo(int idpaciente, String alergias, String medicamentos, String enfermedades, String nombre, int cedula, String apellido, String correoe, int celular, String tiposangre, String fechanacimiento, String dirreccion, String genero, String usuario, String clave) {
        super(nombre, cedula, apellido, correoe, celular, tiposangre, fechanacimiento, dirreccion, genero, usuario, clave);
        this.idpaciente = idpaciente;
        this.alergias = alergias;
        this.medicamentos = medicamentos;
        this.enfermedades = enfermedades;
    }

    

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }
  }
    