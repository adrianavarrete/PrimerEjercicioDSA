import java.util.Arrays;

public class GestorFiguras {

    public static double suma(Figura[] l){

        double ret = 0;

        for (Figura f : l){
            ret+=f.area();
        }

        return ret;
    }

}
