public class Triangulo extends Figura {

    private double base, altura;

    public Triangulo(double base, double altura){

        this.base = base;
        this.altura = altura;
    }


    public double area() {

        double area = (base * altura)/2;
        return area;

    }
}
