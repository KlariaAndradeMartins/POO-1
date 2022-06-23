package EX03;

public class Ponto {

    private int x;
    private int y;
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public void ponto(int m, int n){
        x = m;
        y = n;
    }
    public void soma(int xl, int yl){
        System.out.println("O ponto digitado é: (" + xl + "," + yl + ")");
    }

    public void soma2(int x1, int x2, int y1, int y2){
        int temp1 = x1 + x2;
        int temp2 = y1 + y2;
        System.out.println("A soma de (" + x1 + "," + y1 + ") com (" + x2 + ","+ y2 + ") é igual a: ("+ temp1 + "," +  temp2 + ")" );
    }

    public void areaRetangulo(int x1, int x2, int y1, int y2){
        int temp1 = y1 * x1 / 2;
        int temp2 = y2 * y2 / 2;
        int temp3 = temp1 + temp2;
        System.out.println("A area do retangulo de (" + x1 + "," + y1 + ") com (" + x2 + ","+ y2 + ") é igual a: " + temp3);
    }
    public void multi(int x, int y){
        int temp = (x)*y;
        System.out.println("Resultado: " +  temp);
    }

    public void inc_dir(int x, int y){
        //norte --> y decrement
        int temp = y - 1;
        System.out.println("(" + x + "," + y + ") ==> Norte (" + x + "," + "temp)" );
        //sul --> y crescente
        int temp2 = y + 1;
        System.out.println("(" + x + "," + y + ") ==> Sul (" + x + "," + "temp2)" );
        //leste --> x  incrementa
        int temp3 = x + 1;
        System.out.println("(" + x + "," + y + ") ==> Leste (" + x + "," + "temp3)" );
        //Oeste --> x decrementa
        int temp4 = x -1;
        System.out.println("(" + x + "," + y + ") ==> Oeste (" + x + "," + "temp4)" );
    }


    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
