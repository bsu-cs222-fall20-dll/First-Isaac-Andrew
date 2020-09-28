package edu.bsu.cs222.WikipediaProject;

import edu.bsu.cs222.WikipdiaProject.ApiFetch;
import edu.bsu.cs222.WikipdiaProject.UserInput;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Testing
{
    @Test
    public void inputTest1() throws IOException
    {
        ApiFetch test1 = new ApiFetch("Fish");
        Assert.assertNotNull(test1);
    }
    @Test
    public void inputTest2() throws IOException
    {
        ApiFetch test1 = new ApiFetch("Soup");
        Assert.assertNotNull(test1);
    }

    @Test
    public void inputTest3() throws IOException
    {
        ApiFetch test1 = new ApiFetch("Apple");
        Assert.assertNotNull(test1);
    }

    @Test
    public void inputTest4() throws IOException
    {
        ApiFetch test1 = new ApiFetch("Ham");
        Assert.assertNotNull(test1);
    }




}
