package EX02;

public class CadastraProduto {

    private double codigo;
    private String fabricante;
    private String marca;
    private double preço;

    public void CadastraProduto(double c, String f, String m, double p){
        codigo = c;
        fabricante = f;
        marca = m;
        preço = p;
    }

    public double getCodigo(){
        return codigo;
    }
    public String getFabricante(){
        return fabricante;
    }
    public String getMarca() {
        return marca;
    }
    public double getPreço() {
        return preço;
    }
    public void setPreço(double x) {
        preço = x;
    }
}
