public class nestedLoop {
    public static void main(String[] args) {
        int i=1;
        while(i<=5){
            System.out.println(i);
            int j=1;
            while(j<=4){
                System.out.print(j);
                j+=1;
            }
            i+=1;
            System.out.println();
        }
    }
}
