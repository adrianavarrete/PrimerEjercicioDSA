public class GestorFiguras {

    public static void main(String[] args){

        Figura[] l = new Figura[5];

        l[0] = new Triangulo(6,3);
        l[1] = new Rectangulo(2,3);
        l[2] = new Triangulo(3,5);
        l[3] = new Circulo(5);
        l[4] = new Cuadrado(2);

        double resultado = suma(l);

        System.out.println(resultado);

    }

    public static double suma(Figura[] l){

        double ret = 0;

        for (Figura f : l){
            ret+=f.area();
        }

        return ret;
    }

}
