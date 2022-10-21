import java.io.BufferedReader;
import java.io.FileReader;

public class ClassProductList {

    private ReminderVisitor reminderVisitor;

    private Product[] product;

    private ProductIterator productIterator;

    public void accept(NodeVisitor visitor) {

    }
    public void ReadFile(String fname) {
        try{
            String pname = null;
            BufferedReader f;

            f = new BufferedReader(new FileReader("ProductInfo.txt"));
            while ((pname = f.readLine()) != null) {
                Product product;
                int div = pname.lastIndexOf(':');
                product = new Product(pname.substring(div+1,pname.length()), pname.substring(0,div));
                //add product to the list
                add(product);
            }
            f.close();
        } catch (Exception e)  {

        };
    }

    private void add(Product product) {
    }

}
