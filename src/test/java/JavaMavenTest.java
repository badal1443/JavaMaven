import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class JavaMavenTest {

    private JavaMaven jm;

    @Before
    public void setUp() {
        jm = new JavaMaven();
    }


    @Test
    public void AddTest( ){
        Assert.assertEquals(4, jm.sum(2,2));

    }

    @Test
    public void SubTest( ){
        Assert.assertEquals(3, jm.subtract(5,2));

    }

}
