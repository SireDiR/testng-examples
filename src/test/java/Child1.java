import org.testng.annotations.*;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

/**
 * Created by DiR on 21.06.2015.
 */
public class Child1 extends Base{


    @BeforeTest()
    public void beforeTest_Child_1(){
        test_ch1 = "test_ch1";
        all();
    }

    @AfterTest
    public void afterTest_Child_1(){
        all();
    }

    @BeforeClass
    public void beforeClass_Child_1(){
        _class_ch1 = "_class_ch1";
        all();
    }

    @AfterClass
    public void afterClass_Child_1(){
        all();
    }

    @BeforeGroups(groups = {"one"})
    public void beforeGroup_Child_1(){
        group_ch1 = "group_ch1";
        all();
    }

    @AfterGroups(groups = {"one"})
    public void afterGroup_Child_1(){
        all();
    }

    @BeforeMethod
    public void beforeMethod_Child_1(){
        method_ch1 = "method_ch1";
        all();
    }

    @AfterMethod
    public void afterMethod_Child_1(){
        all();
    }


    @Test(groups = {"one"})
    public void test1_1(){
        all();
    }

    @DataProvider(name = "lol")
    public Object[][] lol(){
        all();
        return new Object[][]{
                {"data_1"},
                {"data_2"}
        };
    }

    @Test(groups = {"one"},dataProvider = "lol")
    public void test1_2(String lol){
        all();
        System.out.println(lol);
    }
    @Test(groups = {"one"})
    public void test1_3(){
        all();
    }
    @Test(groups = {"one", "three"})
    public void test1_4(){
        all();
    }
    @Test(groups = {"one"})
    public void test1_5(){
        all();
    }
    @Test(groups = {"one", "three"})
    public void test1_6(){
        all();
    }

}
