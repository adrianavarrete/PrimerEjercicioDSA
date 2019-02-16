public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio){

        super();
        this.radio = radio;

    }


    public double area() {
        double area = Math.PI * Math.pow(radio,2);
        return area;
    }
}
