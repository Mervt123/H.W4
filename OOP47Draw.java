import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
    public class OOP47Draw extends JComponent {
        public void paintComponent(Graphics g) {
            Rectangle r = new Rectangle(200, 100, 200, 100);
            Graphics2D g2 = (Graphics2D) g;
            g2.fill(r);
            g2.setColor(Color.blue);
            g2.fill(r);
            g2.setColor(Color.red);
            g2.drawString("MERVT",200,150);

        }
}
