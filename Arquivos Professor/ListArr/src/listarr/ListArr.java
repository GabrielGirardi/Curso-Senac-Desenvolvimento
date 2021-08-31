/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarr;

import java.util.Arrays;




/**
 *
 * @author azlin
 */
public class ListArr {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dados a = new Dados();
       System.out.println(Arrays.toString(a.getName()));
       System.out.println(Arrays.toString(a.getIdade()));
       String[] b = a.getName();
       System.out.println(b[0]);
    }  
}
