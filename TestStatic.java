
/**
 * Write a description of class TestStatic here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */
public class TestStatic
{
    private int x, y;
    private static int z;
    
    public TestStatic() {
        x = y = 0;
        z++;
    }
    
    public static void main(String args[]) {
        TestStatic uno, dos, tres;
        
        uno = new TestStatic();
        dos = new TestStatic();
        tres = new TestStatic();
    }
    
}
