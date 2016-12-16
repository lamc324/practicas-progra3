package practicapatronesdiseño;

public class ImpresoraDemo {

    public static void main(String[] args) {
        ImpresoraNormal impresora1 = new ImpresoraNormal("pdf", "a4", true, "texto 1");
        ImpresoraAdicional impresora2 = new ImpresoraAdicional("excel", "a3", false, "texto 2");

        System.out.println(impresora1);
        System.out.println(impresora2);
        
        FachadaImpresora fachada1 = new FachadaImpresora();
        String impresion1 = fachada1.imprimirNormal("texto 1");
        String impresion2 = fachada1.imprimirDiferente("texto 2");
        
        System.out.println(impresion1 + "\n" + impresion2);

    }

}
