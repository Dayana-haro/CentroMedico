/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Menu;

/**
 *
 * @author user
 */
public class Prueba {
    public static void main(String[] args) {
        Conexion conectar =new Conexion();
        conectar.conectar();
        Menu m=new Menu();
        m.setVisible(true);
    } 
}
