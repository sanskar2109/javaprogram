public class ScopeDemo {
    int z;
    void dostuff()
    {
        int z=5;
        dostuff2();
        System.out.println(z);
    }
    void dostuff2(){
        z=4;
    }
    public static void main(String[] args) {
        ScopeDemo myScope = new ScopeDemo();
        int z=6;
        System.out.println(z);
        myScope.dostuff();
        System.out.println(z);
        System.out.println(myScope.z);


    }
}
