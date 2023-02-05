public class box {
    int height=4;
    int width=3;
    int length=2;

    static int area(int height,int width){
        return height*width;
    }
    static int area(int height,int width,int length){
        return height*width*length;
    }
    void display(){
        System.out.println(area(height,width));
        System.out.println(area(height,width,length));
    }
    public static void main(String[] args){
        box obj=new box();
        obj.display();
    }

}
