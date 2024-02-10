/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import controlador.ConexionBDD;

/**
 *
 * @author user
 */
public class PruebaBDD {
    public static void main(String[] args) {
        ConexionBDD conectar =new ConexionBDD();
        conectar.conectar();
    }        
}
