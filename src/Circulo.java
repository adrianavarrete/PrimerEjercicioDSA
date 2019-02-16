public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio){

        super();
        this.radio = radio;

    }


    public double area() {
        double area = radio * Math.pow(Math.PI,2);
        return area;
    }
}
