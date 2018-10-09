
package buscaminas2;
import javax.swing.*;
/**
 *
 * @author yeison
 */
public class Cuadro extends JButton{
    
    private boolean mina;
    
    public Cuadro(){
        super();
        double random=Math.random();
        
        if(random>0.95){
            mina=true;
            System.out.println(random);
        }else{
            mina=false;
        }
    }
        public boolean estaMinado(){
                        
            return mina;
        }
        
    }
