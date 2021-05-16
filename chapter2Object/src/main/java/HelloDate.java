import java.util.Date;

/** HelloDate first java program
 * @author Liupy
 * @version 0.1
 */
public class HelloDate {
    /**
     *
     * @param args array of string params
     *
     */
    public static void main(String[] args) {
        System.out.println("Hello ,it's :");
        System.out.println(new Date());
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(
                System.getProperty("java.library.path"));
    }
}
