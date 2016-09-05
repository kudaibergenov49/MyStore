import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Storm on 05.09.2016.
 * @author Kudaibergen Kuanysh
 * Это класс для чтения данных и записи в массив ArrayList
 */
public class ReadingFile {




    static ArrayList<Integer> read(String fileName) throws FileNotFoundException {
        //Этот спец. объект для построения строки
        exists(fileName);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        try{
            Scanner sc = new Scanner(new File(fileName));
            while(sc.hasNext()){
                arrayList.add(Integer.parseInt(sc.next()));
                }
            sc.close();
        }catch(FileNotFoundException e){e.printStackTrace();}
        return arrayList;
    }

    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }


}
