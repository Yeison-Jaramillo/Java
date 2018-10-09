import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import java.io.*; //Utiliza * para importar todo

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;



public class ejemplo1{
	public static void main (String [ ] Args) throws IOException{
	
	//formateador para los puntos del numero
	DecimalFormat formateador = new DecimalFormat("###,###,###.00");
//Entrada por teclado, metodo BufferedReader, entradaDato
        BufferedReader entradaDato = new BufferedReader(new InputStreamReader( System.in));
	System.out.println("Por favor ingrese un valor en pesos: (sin puntos, solo para los centavos)");
	
	//Declarar variables e inicializarla
	double numero = 0;

	//Entrada dato a String
	String dato1 = entradaDato.readLine();

	//Como no hay metodo para leer doubles, hay que convertir.
	numero= Double.parseDouble(dato1);

	//muestra
	System.out.println ("La cantidad escrita es $ " + formateador.format (numero));
		}
} // final class