public class FibonacciSequence {
    public int  feibonaqie(int a) {
        if (a == 0) {
            return 0;
        }
        if (a == 1) {
            return 1;
        }
        return feibonaqie(a-1)+feibonaqie(a-2);
    }

    public static void main(String args[]){
        FibonacciSequence f = new FibonacciSequence();
        System.out.println(f.feibonaqie(6));
    }
}
