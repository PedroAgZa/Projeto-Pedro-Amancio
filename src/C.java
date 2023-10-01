public class C {
    private String C1;
    private int C2;


    public String getC1() {
        return C1;
    }

    public void setC1(String C1) {
        this.C1 = C1;
    }
    
    public int getC2() {
        return C2;
    }

    public void setC2(int C2) {
        this.C2 = C2;
    }

    public static void MC1(){
        System.out.println("MC1()");
    }

    public static void MC2(){
        System.out.println("MC2()");
    }

    public static void main(String[] args) throws Exception {
        MC1();
        MC2();
    }
}