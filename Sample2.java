class Sample2{
    public static void main(String ar[]){
        //float f=1.2;
        //boolean b=1;
        //System.out.println(f);
        //System.out.println(b);
/* In the above code, 1.2 is double value and 1 is int and 
    converting them to float and bool leads to Lossy Conversion Error */

//Corrected Form
        float f=1.2F;
        boolean b=true;
        System.out.println(f);
        System.out.println(b);

        double d=1.2D;
        System.out.println(d);

        //int 9A=10;     not valid definition of a variable

        //Concatenation
        int p=10, q=017, r=0X3A;
        System.out.println(p+","+q+" ,"+r);

    }
}