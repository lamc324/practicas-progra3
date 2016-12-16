package practicapatronesdiseño;

public class Impresora {

    private String tipoDocumento;
    private String hoja;
    private boolean color;
    private String texto;

    public Impresora() {

    }

    public Impresora(String tipoDocumento, String hoja, boolean color, String texto) {
        this.tipoDocumento = tipoDocumento;
        this.hoja = hoja;
        this.color = color;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Impresora {" + "tipoDocumento=" + tipoDocumento + ", hoja=" + hoja + ", color=" + color + ", texto=" + texto + '}';
    }
    
    

}
