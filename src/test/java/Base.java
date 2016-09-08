import org.testng.annotations.*;

import static java.lang.Thread.*;

/**
 * Created by DiR on 21.06.2015.
 */
public class Base {

    String suite;
    String test;
    String _class;
    String method;
    String group;
    String suite_ch1;
    String test_ch1;
    String _class_ch1;
    String method_ch1;
    String group_ch1;
    String suite_ch2;
    String test_ch2;
    String _class_ch2;
    String method_ch2;
    String group_ch2;


    public void all(){
        System.out.println();
        System.out.println("thread ID = " + currentThread().getId());
        System.out.println(currentThread().getStackTrace()[2].getMethodName());
        System.out.println(suite);
        System.out.println(test);
        System.out.println(_class);
        System.out.println(group);
        System.out.println(method);
        System.out.println(suite_ch1);
        System.out.println(test_ch1);
        System.out.println(_class_ch1);
        System.out.println(group_ch1);
        System.out.println(method_ch1);
        System.out.println(suite_ch2);
        System.out.println(test_ch2);
        System.out.println(_class_ch2);
        System.out.println(group_ch2);
        System.out.println(method_ch2);
    }

    @BeforeSuite
    public void before_Suite(){
        suite = "suite";
        all();
    }

    @AfterSuite
    public void after_Suite(){
        all();
    }

    @BeforeTest
    public void beforeTest_Super(){
        test = "test";
        all();
    }

    @AfterTest
    public void afterTest_Super(){
        all();
    }

    @BeforeClass
    public void beforeClass_Super(){
        _class = "class";
        all();
    }

    @AfterClass
    public void afterClass_Super(){
        all();
    }

    @BeforeMethod
    public void beforeMethod_Super(){
        method = "method";
        all();
    }

    @AfterMethod
    public void afterMethod_Super(){
        all();
    }

    @BeforeGroups(groups = {"one"})
    public void beforeGroup1_Super(){
        group = "group";
        all();
    }

    @AfterGroups(groups = {"one"})
    public void afterGroup1_Super(){
        all();
    }

    @BeforeGroups(groups = {"two", "three"})
    public void beforeGroup2_Super(){
        all();
    }

    @AfterGroups(groups = {"one", "three"})
    public void afterGroup2_Super(){
        all();
    }


}
