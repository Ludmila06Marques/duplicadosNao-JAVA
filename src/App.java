import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       

        String[] array1={"Morango", "Uva","Acerola","Manga"};
        String[] array2={"Pera", "Caju","Morango","Kiwi"};
        List<String> meuArrayInfinito = new ArrayList<>();

        for(int i=0 ; i<array1.length; i++){
            for(int j=0; j<array2.length;j++){
                if(array1[i].equalsIgnoreCase(array2[j])){
                    meuArrayInfinito.add(array2[j]);
                }
            }
        }


        System.out.println(meuArrayInfinito);

    }
}
