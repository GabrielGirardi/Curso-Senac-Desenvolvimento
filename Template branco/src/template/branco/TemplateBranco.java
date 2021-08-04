// programa teste hello world
package template.branco;

/**
 *
 * @author gabriel.girardi
 */
public class TemplateBranco {

    /**
     * @param args the command line arguments
     */             int a = 3;
            int b = 4;
                        int c = 5;
            int d = 6;
                        int e = 7;
            int f = a + b;
                        int g = a + c;
            int h = a + d;
            
    public static void main(String[] args) {
       
        
        
        TemplateBranco Val = new TemplateBranco ();
        String str2 = "Números inteiros somados ";
        String str1 = "Hello world \n";
            
        
            int [] ListNum = {1, 2, 3, 4, 6, 8, 10};
            int resp = 11;
             
                System.out.print(str1);
                System.out.println(str2);
                System.out.print(str2 + str1);
                System.out.printf("Soma das variáveis a e b = %d \n", (Val.a + Val.b));
                System.out.printf("Soma das variáveis a e c = %d \n", (Val.a + Val.c));
                System.out.printf("Soma das variáveis a e d = %d \n", (Val.a + Val.d));
                System.out.printf("Soma das variáveis a e e = %d \n", (Val.a + Val.e));
                    if(ListNum[0] + ListNum[6] == resp){
                        System.out.printf("Primeira soma, seu resultado é 7 -"  ,ListNum[6]);
                        System.out.printf(" Segunda soma, seu resultado é 8 -"  ,ListNum[0]);
                        System.out.printf(" Terceira soma, seu resultado é 9 -",resp); 
                        System.out.printf(" Quarta soma, seu resultado é 10 -",resp);}
                    else{
                        System.out.print ("resposta incorreta");
                    }
                            
                                    
                    
    }
    
}
