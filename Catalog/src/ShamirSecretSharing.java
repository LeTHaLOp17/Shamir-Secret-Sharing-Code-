import java.math.BigInteger;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class ShamirSecretSharing {

    public static void main(String[] args) {
        String filename1 = "A:\\Catalog\\src\\testcase1.json";
        String filename2 = "A:\\Catalog\\src\\testcase2.json";

        try {
            System.out.println("Processing file 1:");
            JSONObject jsonObject1 = loadDataFromFile(filename1);
            System.out.println("Processing file 2:");
            JSONObject jsonObject2 = loadDataFromFile(filename2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static JSONObject loadDataFromFile(String filename) throws Exception {
        String content = new String(Files.readAllBytes(Paths.get(filename)));
        JSONObject jsonObject = new JSONObject(content);

        JSONObject keys = jsonObject.getJSONObject("keys");
        int n = keys.getInt("n");
        int k = keys.getInt("k");

        //Iterator karne ke liye
        Iterator<String> keysIterator = jsonObject.keys();

        while (keysIterator.hasNext()) {
            String key = keysIterator.next();
            if (key.equals("keys")) continue;

            JSONObject root = jsonObject.getJSONObject(key);
            int base = Integer.parseInt(root.getString("base"));
            String value = root.getString("value");

            // Converting value to BigInteger
            BigInteger y = new BigInteger(value, base);
            System.out.println("x: " + key + ", y: " + y);
        }
        return jsonObject;
    }
}