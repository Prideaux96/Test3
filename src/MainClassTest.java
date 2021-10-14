import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    @Test
    public void testGetClassNumber()
    {
        MainClass test = new MainClass();
        String result = test.getClassString();
        Assert.assertTrue("does not contain 'Hello' or 'hello' " ,result.contains("Hello") || result.contains("hello"));
    }

}