import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class OOP41 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Scanner p=new Scanner(System.in);
        // int x= p.nextInt();
        //int y=p.nextInt();
        System.out.println(r.getX());
        System.out.println(r.getY());
        System.out.println(r.getWidth());
        System.out.println(r.getHeight());
        Rectangle box = new Rectangle(5, 10, 20, 30);
        box.add(0, 0);


    }
}

