package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {

    //Declare the "@Before Array"
    ArrayList newArrayList;

    @Before
    public void before(){
        newArrayList = new ArrayList<>();
    }

    @Test
    public void addTest(){
        Assert.assertTrue(newArrayList.add("John"));
    }


    @Test
    public void removeTest(){
        // needed to add to the array before being able to remove
        addTest();
        Assert.assertTrue(newArrayList.remove("John"));
    }

    @Test
    public void size(){
        addTest();
        Integer expected = 1;
        Integer actual = newArrayList.size();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void toArray(){
        Integer[] expected = new Integer[0];
        Integer[] actual = (Integer[]) newArrayList.toArray(new Integer[0]);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void contains(){
        addTest();
        Assert.assertTrue(newArrayList.contains("John"));

    }

}
