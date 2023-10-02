public class D {
    private String D1;
    private int D2;


    public String getD1() {
        return D1;
    }

    public void setD1(String D1) {
        this.D1 = D1;
    }
    
    public int getD2() {
        return D2;
    }

    
    public void setD2(int D2) {
        this.D2 = D2;
    }

    public static void MD1(){
        System.out.println("MD1()");
    }

    public static void MD2(){
        System.out.println("MD2()");
    }

    public static void MD3(){
        System.out.println("MD3()");
    }

    public static void MD4(){
        System.out.println("MD4()");
    }

    public static void main(String[] args) throws Exception {
        MD1();
        MD2();
        MD3();
        MD4();
    }
}
