/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engsoft6;

/**
 *
 * @author HP
 */
public class Fila {
    private static Fila instancia;
    
    Fila() {
        
    }
    
    public static synchronized Fila getInstance() {
    	if(instancia == null){
            instancia = new Fila();
        }
        
	return instancia;
    }
    
    public static void ImprimeDocumento(){
        
    }
    
    public static void RemoveDocumento(){
        
    }
    
    public static void RemoveTodosDocumentos(){
        
    } 
}