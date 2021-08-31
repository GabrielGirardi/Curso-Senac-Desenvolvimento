/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarr;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author gabriel.girardi
 */
public class Dados {

    private String[] name = new String[4];
    private int[] idade = new int[4];
    
    /*ArrayList<String> da = new ArrayList<String>();
    public String[] name = {"A1","B1","C1","D1"};
    public int[] idade = {1, 2, 3, 4};
    
    public void cadArraylist()
    {
        for(int i =0; i< name.length; i++){
        da.add(name[i]);
        da.add(Integer.toString(idade[i]));
        }  
    }
     
     public void lerArraylist()
    {
        for(int i =0; i< da.size(); i++){
            System.out.println("O valor "+ i + " da lista eh: " + da.get(i));
        } 
    } */
    public Dados() {
        
        this.name = new String [] {"A1","B2","C1","D1"};
        this.idade = new int []{1, 2, 3, 4};
    }

    public String[] getName() {
        return name;
    }
    
    public void setName (String[] name){
        this.name = name;
    }

    public int[] getIdade() {
        return idade;
    }
    
    public void setIdade(int[] idade) {
        this.idade = idade;
    }


  public static void main(String[] args) {
    Dados a = new Dados();
     System.out.println(Arrays.toString(a.getName()));
     System.out.println(Arrays.toString(a.getIdade()));
        String[] b = a.getName();
     System.out.println(b[0]);
        b[0]="E1";
        a.setName(b);
        System.out.println(Arrays.toString(a.getName()));
        int[] c = a.getIdade();
        System.out.println(c[0]);
        c[0] = 90;
        a.setIdade(c);
        System.out.println(Arrays.toString(a.getIdade()));
        
    }
}