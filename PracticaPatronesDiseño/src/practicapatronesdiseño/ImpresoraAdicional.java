/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapatronesdiseño;

/**
 *
 * @author Estudiante
 */
public class ImpresoraAdicional extends Impresora {

    public ImpresoraAdicional() {

    }

    public ImpresoraAdicional(String tipoDocumento, String hoja, boolean color, String texto) {
        super(tipoDocumento, hoja, color, texto);
    }

    public ImpresoraAdicional(String texto) {
        super("excel", "a3", false, texto);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    

}
