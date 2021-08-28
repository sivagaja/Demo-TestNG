import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGClass {

@AfterTest
public void test()
{
	System.out.println("Hello Test3");
}

@BeforeTest
public void test1()
{
	System.out.println("Hello Test1");
}
@Test
public void test2()
{
	System.out.println("Hello Test2");
}
}
