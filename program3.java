public class program3 {

    public static void main(String[] args) {
        int x=9;
        int v=x%2;
        if(v!=0){
            System.out.print("odd");
            if(v<5){
                System.out.print("\ngreat");
            }
            else{
                System.out.println("\n okay");
            }
        }
        else{
            System.out.println("even");
        }
    }
}
