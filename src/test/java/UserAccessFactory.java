import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

/**
 * Created by DiR on 14.09.2016.
 */
public class UserAccessFactory {
    @Factory
    public Object[] createInstances2() {
        Object[] result = new Object[3];
        User seller = new User("seller", "qwerty");
        User buyer = new User("buyer", "123456");
        User admin = new User("admin", "DRET@d754");
        result[0] = new UserAccessTests2(seller);
        result[1] = new UserAccessTests2(buyer);
        result[2] = new UserAccessTests2(admin);
        return result;
    }
}