import java.awt.*;
public class OOP44 {
        public static void add(int newx,int newy)
        {  Rectangle r=new Rectangle();
            System.out.println(r.getX());
            System.out.println(r.getY());
            System.out.println(r.getWidth());
            System.out.println(r.getHeight());
        }
        public static void main(String[] args) {
            Rectangle box = new Rectangle(5, 10, 20, 30);
            box.add(5,10);
            System.out.print(box);

        }

}
