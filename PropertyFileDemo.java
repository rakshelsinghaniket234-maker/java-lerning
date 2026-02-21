import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyFileDemo {
    public static void main(String[] args) throws Exception {

        // 1. Properties object
        Properties p = new Properties();

        // 2. Set key-value pairs
        p.setProperty("un", "root");
        p.setProperty("ps", "1234");
        p.setProperty("url", "jdbc:mysql://localhost:3306/test");

        // 3. FileOutputStream (file create/write)
        FileOutputStream fout =
                new FileOutputStream("db.properties");

        // 4. Store data into properties file
        p.store(fout, "This is database configuration file");

        // 5. Close stream
        fout.close();

        // 6. Success message
        System.out.println("Data written successfully in properties file");
    }
}