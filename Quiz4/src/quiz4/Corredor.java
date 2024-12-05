/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz4;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Corredor {

    private String Nombre;
    private int edad;
    private int corredorId;
    private int estTime;
    private int realTime;
    private int categoria;

    public Corredor(String Nombre, int edad, int corredorId, int estTime, int realTime, int categoria) {
        this.Nombre = JOptionPane.showInputDialog("Ingrese Nombre");
        this.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad"));
        this.corredorId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID Corredor"));
        this.estTime = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo estimado"));
        this.realTime = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo real"));
        this.categoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese categoria por edad"));
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCorredorId() {
        return corredorId;
    }

    public void setCorredorId(int corredorId) {
        this.corredorId = corredorId;
    }

    public int getEstTime() {
        return estTime;
    }

    public void setEstTime(int estTime) {
        this.estTime = estTime;
    }

    public int getRealTime() {
        return realTime;
    }

    public void setRealTime(int realTime) {
        this.realTime = realTime;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Corredor{" + "Nombre=" + Nombre + ", edad=" + edad + ", corredorId=" + corredorId + ", estTime=" + estTime + ", realTime=" + realTime + ", categoria=" + categoria + '}';
    }

    public String getCorredor(Corredor corredor[]) {
        for (int i = 0; i < corredor.length; i++) {
        corredor[i]= new Corredor(Nombre,edad,corredorId,estTime,realTime,categoria);

        }
        return null;
    }
}
