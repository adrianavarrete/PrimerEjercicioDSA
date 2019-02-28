import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        Figura[] l = new Figura[5];

        l[0] = new Triangulo(6,3);
        l[1] = new Rectangulo(2,3);
        l[2] = new Triangulo(3,5);
        l[3] = new Circulo(5);
        l[4] = new Cuadrado(9);

        double resultado = GestorFiguras.suma(l);

        System.out.println(resultado);

        Arrays.sort(l);

        for(Figura e:l){
            System.out.println(e.area());
        }

    }
}
