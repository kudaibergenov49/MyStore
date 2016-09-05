import java.io.FileNotFoundException;

/**
 * Created by Storm on 05.09.2016.
 * @author Kudaibergen Kuanysh
 * Main class
 */
public class Main {
    private static String fileName = "C:\\Users\\Storm\\Desktop\\1.txt";

    public static void main(String[] args) throws FileNotFoundException {

      //  String fileName = args[0];

        //Запишем в массив данные из файла
        int[][] mass = GetDoubleArray.getDoubleArray(ReadingFile.read(fileName));
        //Выведем данные
        STDOUT.stdout(mass);

    }

}
