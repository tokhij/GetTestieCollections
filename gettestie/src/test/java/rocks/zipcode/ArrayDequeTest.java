package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {

    //Declare the "@Before Array"
    ArrayDeque newArrayDQ;

    @Before
    public void before(){
        newArrayDQ = new ArrayDeque();
    }

    @Test
    public void addTest(){
        String str = "John";
        Assert.assertTrue(newArrayDQ.add(str));

    }


    @Test
    public void removeTest(){
        // needed to add to the array before being able to remove
        addTest();
        Assert.assertTrue(newArrayDQ.remove("John"));
    }

    @Test
    public void sizeTest(){
        addTest();
        Integer expected = 1;
        Integer actual = newArrayDQ.size();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void toArrayTest(){
        Integer[] expected = new Integer[0];
        Integer[] actual = (Integer[]) newArrayDQ.toArray(new Integer[0]);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void containsTest(){
        addTest();
        Assert.assertTrue(newArrayDQ.contains("John"));

    }

    @Test
    public void addFirstTest() {
        String str = "John";
        newArrayDQ.addFirst(str);

        System.out.println(str);
    }

    @Test
    public void addLastTest(){
        String str = "John";
        newArrayDQ.addLast(str);

        System.out.println(str);
    }


    @Test
    public void removeFirstTest(){


    }

    @Test
    public void removeLastTest(){


    }



}
