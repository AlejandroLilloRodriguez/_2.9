package dominio;
import java.util.ArrayList;
public class Ejercicio9 {
    public static ArrayList suma (int[]lista,ArrayList lista2,int n){
        if(n==0){
            if(lista[0]%2==0){
                lista2.add(lista[n]);
                return lista2;
            } else
                return lista2;
        }else{

            if(lista[n]%2!=0)
                return suma(lista,lista2,n-1);
            else
                lista2.add(lista[n]);
            return suma(lista,lista2,n-1);



        }
    }
}
