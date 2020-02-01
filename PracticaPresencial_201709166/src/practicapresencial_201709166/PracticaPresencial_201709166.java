/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapresencial_201709166;

import javax.swing.JFrame;
import org.jacky.bean.CuentaHabiente;

/**
 *
 * @author Benitez
 */
public class PracticaPresencial_201709166 {

public static CuentaHabiente listaCuentaHabiente[]=new CuentaHabiente[100];

    public static CuentaHabiente[] getListaCuentaHabiente() {
        return listaCuentaHabiente;
    }

    public static void setListaCuentaHabiente(CuentaHabiente[] listaCuentaHabiente) {
        PracticaPresencial_201709166.listaCuentaHabiente = listaCuentaHabiente;
    }

public static void IniciarCuentaHabiente(){
    for (int i = 0; i < listaCuentaHabiente.length; i++) {
        listaCuentaHabiente[i]=new CuentaHabiente();
    }
}
    public static void main(String[] args) {
        IniciarCuentaHabiente();
        
        RegistroGrafico home=new RegistroGrafico();
        home.setVisible(true);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
