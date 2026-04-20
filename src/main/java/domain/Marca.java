
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Hogar
 */
public class Marca {
   private String Nombre;
   private String Pais;

    public Marca(String Nombre, String Pais) {
        this.Nombre = Nombre;
        this.Pais = Pais;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPais() {
        return Pais;
    }
    
}

