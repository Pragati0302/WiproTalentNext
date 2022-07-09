class swapThreeNum{
    public static void main(String[] args) {
        int x=10,y=20,z=30, temp1;
        //int temp2;
        System.out.println("before swapping: x="+x+", y="+y+", z="+z);
        temp1 = x;
        x = z;
        z = y;
        y = temp1;
        System.out.println("After Swapping: x="+x+", y="+y+", z="+z);
    }
}