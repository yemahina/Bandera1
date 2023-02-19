/*Yemahina
 * 21 de Octubre del 2019
 * Programa que imprime ASCII Art
 * 
 */
package bandera1;

/**
 *
 * @author Yemahina 
 */
public class Bandera1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        char bandera [][] = {{' ','_','_','_','_','_','_','_',' '},  //Se crea el arreglo que contiene los caracteres
	         {'/','\\',' ',' ',' ',' ',' ',' ','\\'},
                 {'|',' ','\\',' ',' ',' ',' ',' ','|'},
	         {'|',' ',' ','\\','_','_','_','_','|'},
	         {'|',' ','@',' ','\\',' ',' ',' ','|'},
	         {'|',' ',' ',' ','/',' ',' ',' ','|'},
	         {'|',' ',' ','/','_','_','_','_','|'},
	         {'|',' ','/',' ',' ',' ',' ',' ','|'},
	         {'\\','/','_','_','_','_','_','_','/'}
	         
	        };
	        
        System.out.printf("Bandera");// imprime la frase bandera
        for(int i = 0; i <=8 ; i++){ //se imprime la primer bandera
	            System.out.println();
	           
	            for(int j = 0; j<=8; j++){
	            System.out.printf("%c", bandera[i][j]);
	            }    
	        }
	        
        System.out.println(); // se da un salto de linea
        
	System.out.printf("\n Bandera"); 
        
            
           
                    for(int i = 0; i <=8 ; i++){ // se impriomen las siguientes dos banderas
	            System.out.println();
	            
	            for(int j = 0; j<=8; j++){
                   
	            System.out.printf("%c", bandera[i][j]);
                    
                    if (j == 8)
                    {
                        
                    System.out.printf("    ");
                     for(int k = 0; k<=8; k++){
                   
	            System.out.printf("%c", bandera[i][k]);
                    }
                    }
	            }    
	            }
    }
                   
        
        
    }
    
