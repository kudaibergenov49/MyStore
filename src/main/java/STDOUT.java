/**
 * Created by Storm on 05.09.2016.
 * @author Kudaibergen Kuanysh
 * Это класс для вывода данных
 */
public class STDOUT {
    static void stdout(int[][] mass){
        int[] example = new int[2];

        for (int i = 0; i < mass.length - 1; i++) {
            example[0] = mass[i][1];
            example[1] = mass[i][0];

            for (int j = i + 1; j < mass.length ; j++) {
                if(example[0] == mass[j][0] && example[1] == mass[j][1]){
                    System.out.println(mass[i][0] + " " + mass[i][1] + " " + mass[i][0]);
                }
            }
        }
    }
}
