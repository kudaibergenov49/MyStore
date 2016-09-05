import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by Storm on 05.09.2016.
 */
public class GetDoubleArrayTest {
    @Test
    public void getDoubleArray() throws Exception {

        GetDoubleArray getDoubleArray = new GetDoubleArray();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,2,1,3,4,5,6,6,5));
        int[][] expected = new int[][]{{1,2},{2,1},{3,4},{5,6},{6,5}};

        assertEquals(getDoubleArray.getDoubleArray(arrayList), expected);

    }

}