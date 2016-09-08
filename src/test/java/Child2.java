import org.testng.annotations.*;

/**
 * Created by DiR on 21.06.2015.
 */
public class Child2 extends Base{


    @BeforeTest
    public void beforeTest_Child_2(){
        test_ch2 = "test_ch2";
        all();
    }

    @AfterTest
    public void afterTest_Child_2(){
        all();
    }

    @BeforeClass
    public void beforeClass_Child_2(){
        _class_ch2 = "_class_ch2";
        all();
    }

    @AfterClass
    public void afterClass_Child_2(){
        all();
    }

    @BeforeGroups({"one", "three"})
    public void beforeGroup_Child_2(){
        group_ch2 = "group_ch2";
        all();
    }

    @AfterGroups({"one", "three"})
    public void afterGroup_Child_2(){
        all();
    }

    @BeforeMethod
    public void beforeMethod_Child_2(){
        method_ch2 = "method_ch2";
        all();
    }

    @AfterMethod
    public void afterMethod_Child_2(){
        all();
    }

    @Test(groups = {"two"})
    public void test2_1(){
        all();
    }

    @Test(groups = {"two"})
    public void test2_2(){
        all();
    }
    @Test(groups = {"two"})
    public void test2_3(){
        all();
    }
    @Test(groups = {"two", "three"})
    public void test2_4(){
        all();
    }
    @Test(groups = {"two"})
    public void test2_5(){
        all();
    }
    @Test(groups = {"two", "three"})
    public void test2_6(){
        all();
    }
}
