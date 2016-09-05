import java.util.ArrayList;

/**
 * Created by Storm on 05.09.2016.
 * @author Kudaibergen Kuanysh
 * Это класс для преобразования структуры из arraylist в двойной массив
 */
public class GetDoubleArray {
    public static int[][] getDoubleArray(ArrayList<Integer> arrayList){
        int n = arrayList.size()/2;

        int[][] mass = new int[n][2];

        int t = 0;

        for (int i = 0; i < n ; i++) {
            mass[i][0] = arrayList.get(t);
            t++;
            mass[i][1] = arrayList.get(t);
            t++;
        }


        return mass;
    }
}
