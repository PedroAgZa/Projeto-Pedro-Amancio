public class B {
    private int B1;
    private float B2;


    public int getB1() {
        return B1;
    }

    
    public void setB1(int B1) {
        this.B1 = B1;
    }

    
    public float getB2() {
        return B2;
    }

    
    public void setB2(float B2) {
        this.B2 = B2;
    }

    public static void MB1(){
        System.out.println("MB1()");
    }

    public static void MB2(){
        System.out.println("MB2()");
    }


    public static void main(String[] args) throws Exception {
        MB1();
        MB2();
    }
}