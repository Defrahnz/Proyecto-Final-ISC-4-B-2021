/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;



import clases.DatosA;
import clases.Inicio;
import clases.Musica;
import conector.MySqlConn;


/**
 *
 * @author nihil
 */
public class Main {
    //Este es un cambio
    MySqlConn objconn=new MySqlConn();
    public Main(){
        new DatosA().setVisible(true);
        new Musica().setVisible(true);
        
    }
    public static void main(String[] args) {
        new Main();
       // Principal P = new Principal();
       // P.setVisible(true);
        
    }
    //Se ha agrgado unb comentario de prueba
    //¿Que 
    
}
