package es.unileon.prg1.blablakid;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TecladoBasico{
    
    /**
     * Reads one line per console.
     *
     *
     * @return String A line with the command.
     */
    public static String readLine() {
        String line="";
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            line = br.readLine();
        }
        catch(Exception e){
            e.printStackTrace();
        } 
        
        return line;
    }
    
}
