import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Created by DiR on 14.09.2016.
 */
public class UserAccessTests2 {
    private User user;
    public UserAccessTests2(User user) {
        this.user = user;
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

