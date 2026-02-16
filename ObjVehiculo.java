public class objvehiculo {
    private String marca;
    private String tipo;
    private int cilindraje;
    private int numcelda;
    private Float pagoAnt, pagoAct;

    public static void main(String[] args) {
        
    }

    public objvehiculo(String marca, String tipo, int cilindraje, int numcelda, Float pagoAnt, Float pagoAct) {
        this.marca = marca;
        this.tipo = tipo;
        this.cilindraje = cilindraje;
        this.numcelda = numcelda;
        this.pagoAnt = pagoAnt;
        this.pagoAct = pagoAct;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getNumcelda() {
        return numcelda;
    }

    public void setNumcelda(int numcelda) {
        this.numcelda = numcelda;
    }

    public Float getPagoAnt() {
        return pagoAnt;
    }

    public void setPagoAnt(Float pagoAnt) {
        this.pagoAnt = pagoAnt;
    }

    public Float getPagoAct() {
        return pagoAct;
    }

    public void setPagoAct(Float pagoAct) {
        this.pagoAct = pagoAct;
    }

    public objvehiculo() {
    }
    
}
