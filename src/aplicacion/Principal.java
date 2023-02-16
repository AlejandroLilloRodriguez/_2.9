package aplicacion;
import dominio.*;
import java.util.ArrayList;
public class Principal {
    public static void main(String []args){
        int [] lista={2,4,5,44,32,12,11,3};
        ArrayList lista2= new ArrayList<>();
        System.out.print(Ejercicio9.suma(lista,lista2,lista.length-1));
    }
}
