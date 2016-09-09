
/**
 * @Laurel Woods
 * @lab 4 9/9
 */
public class LoopOne
{
    private int[] numArray = new int[10];
    private String print = "";
    public LoopOne() {
    }
    
    public void loadArray() {
       
        for (int i = 0; i < numArray.length; i ++ ) {
            numArray[i] = (i + 1) * 5;
            print = print + numArray[i] + " \t " ;
        }
    }
    
    public String printArray() {
        return print;
    }
}
