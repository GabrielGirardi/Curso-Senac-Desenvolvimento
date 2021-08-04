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
             
                if(Val.a + Val.b == Val.c * Val.d)
                        System.out.print(str1);   
                            else {
                                System.out.print (str2);
                    }
                            
                                    
                    
    }
    
}
