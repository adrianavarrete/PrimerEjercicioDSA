public class Rectangulo extends Figura {
    private double l1;
    private double l2;

    public Rectangulo(double l1, double l2){
        super();
        this.l1=l1;
        this.l2=l2;

    }

    public double area(){
        double area = l1*l2;
        return area;

    }
}
