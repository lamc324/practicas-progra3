
package practicapatronesdiseño;


public class FachadaImpresora {
    
    private ImpresoraNormal impresoraNormal;
    private ImpresoraAdicional impresoraAdicional;
    
    public FachadaImpresora(){
      
    }
    
    public String imprimirNormal(String texto){
        impresoraNormal = new ImpresoraNormal(texto);
        return impresoraNormal.toString();
    }
    
    public String imprimirDiferente(String texto){
        impresoraAdicional = new ImpresoraAdicional(texto);
        return impresoraAdicional.toString();
    }
    
    
}
