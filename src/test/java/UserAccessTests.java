import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Created by DiR on 14.09.2016.
 */
public class UserAccessTests {
    private User user;
    @Factory(dataProvider = "listOfUsers")
    public UserAccessTests(User user) {
        this.user = user;
    }

    @DataProvider
    public static Object[][] listOfUsers(){
        return new Object[][]{
                {new User("buyer", "123456")},
                {new User("seller", "qwerty")},
                {new User("admin", "DRET@d754")}
        };
    }

    @Test
    public void loginTests() {
        System.out.println(user.getLogin());
        //assert login successful
    }

    @Test
    public void doThis() {
        System.out.println(user.getLogin());
        //assert smth
    }

    @Test
    public void doThat() {
        System.out.println(user.getLogin());
        //assert smth
    }

    @Test
    public void buyingTest() {
        System.out.println(user.getLogin());
        //assert buying stuff
    }

    @Test
    public void refundTest() {
        System.out.println(user.getLogin());
        //assert refunding stuff
    }
}

