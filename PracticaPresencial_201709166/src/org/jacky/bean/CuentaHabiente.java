
package org.jacky.bean;

/**
 *
 * @author Benitez
 */
public class CuentaHabiente {
 private String nombre;
 private String apellido;
 private String fechanac;
 private int dpi;
 private String procedencia;
 private int monto;
 private int telefono;
 private String contraseña;
 private int numero;
 public boolean vacio;

    public boolean isVacio() {
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
 
 
 
 public CuentaHabiente(String nombre, String apellido, String fechanac, int dpi, String procedencia, int monto, int telefono, String contraseña, int numero, boolean vacio){
 this.nombre=nombre;
 this.apellido=apellido;
 this.dpi=dpi;
 this.procedencia=procedencia;
 this.monto=monto;
 this.telefono=telefono;
 this.contraseña=contraseña;
 this.numero=numero;
 this.vacio=false;
 }

  public CuentaHabiente(){
 this.nombre="";
 this.apellido="";
 this.dpi=-1;
 this.procedencia="";
 this.monto=-1;
 this.telefono=-1;
 this.contraseña="";
 this.numero=-1;
 this.vacio=true;
 
 
 
 }
}
