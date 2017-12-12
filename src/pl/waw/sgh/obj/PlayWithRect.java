package pl.waw.sgh.obj;

public class PlayWithRect {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        r1.setParams(3,6);
        double r1Surface=r1.calcSurface();
        System.out.println("Surface is:"+r1Surface);

        Rectangle r2= new Rectangle();
        r1.setParams(2,5);
        double r2Surface=r1.calcSurface();
        System.out.println("Surface is:"+r2Surface);
        //uses values from Rectangle class
        Rectangle r3 = new Rectangle();
        System.out.println(r3.calcSurface());
    }
}
