package primitivetypes1;

/**
 *
 * @author Raikao
 */
public class PrimitiveTypes1 {
  
    
    
    
    public static void main(String[] args) {
        byte byteVar = 127;
        short shortVar = 469;
        int intVar = 200_000;
        long longVar = 5000L + 10L*(byteVar + shortVar + intVar);
        System.out.println(longVar);
    }
    
}
