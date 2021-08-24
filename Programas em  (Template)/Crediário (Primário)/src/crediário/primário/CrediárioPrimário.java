/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crediário.primário;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.girardi
 */
public class CrediárioPrimário {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Dados a = new Dados();
        a.name = "Gabriel";
        a.idade = 17;
      String arq = "infor.dat";      
        try{
      ObjectOutputStream oS = new ObjectOutputStream(new FileOutputStream(arq));
        oS.writeObject(a);
        oS.close();
    }catch(FileNotFoundException e){ 
        JOptionPane.showMessageDialog(null, e.getMessage());
    }catch(IOException e){
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        try{
    ObjectInputStream iS = new ObjectInputStream(new FileInputStream(arq));  
    Dados resp = (Dados)iS.readObject();
    System.out.println("Recebendo dados: Nome: " + resp.name + " - idade: " + resp.idade);
    iS.close();
        }catch(IOException e){
               JOptionPane.showMessageDialog(null, e.getMessage());
        }catch(ClassNotFoundException e){
               JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
    }
}
