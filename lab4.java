
  public class lab4 {
    static void method1(){
        System.out.println("Static Method");
    }
    void method2(){
        System.out.println("Non-Static Method");
    }
    public static void main(String[] args){

       method1() ;
       lab4 obj=new lab4();
       obj.method2();
    }

}
