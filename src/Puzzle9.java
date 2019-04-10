public class Puzzle9 {
    public static void main(String args[]) {
        for (float f = 0.6f; f < 1.0f; f += 0.1f){
            System.out.println(f);
            if(f==0.9f){
                f=f-1f;
            }
        }
    }
}
