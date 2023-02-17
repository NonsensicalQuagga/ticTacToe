import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends Canvas{

    public int[] crossX;
    public int[] crossY;
    public int[] circleX;
    public int[] circleY;


    public int width = 570;
    public TicTacToe() {
        setSize(width,width);
        JFrame frame = new JFrame();
        frame.add(this);
        frame.addKeyListener(new MyKeyListener());
        this.addMouseMotionListener(new MyMouseMotionListener());
        this.addMouseListener(new MyMouseListener());
        requestFocus();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        draw(g);
        drawX(crossX, crossY, width, g);
        repaint();

    }

    public void draw(Graphics g) {
        g.setColor(new Color( 7, 148, 45));
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(Color.black);
        int y = 0;
        int x = 0;
        for (;true;){
        //    g.fillPolygon(new int[] {x*width/13 *4, (x+1)*width/13 * 4, (x+1)*width/13 * 4, x*width/13 * 4 + width/13, x*width/13 * 4 + width/13, x*width/13 * 4, x*width/13 * 4}, new int[] {y*width/13 * 4, y*width/13 * 4, y*width/13 * 4 + width/13, y*width/13 * 4 + width/13, y*width/13 * 4 + width/13 * 4, y*width/13 * 4 + width/13 * 4, y*width/13 * 4},  7);
            g.fillPolygon(new int[] {x*width/19 *6, (x+1)*width/19 * 6, (x+1)*width/19 * 6, x*width/19 * 6 + width/19, x*width/19 * 6 + width/19, x*width/19 * 6, x*width/19 * 6}, new int[] {y*width/19 * 6, y*width/19 * 6, y*width/19 * 6 + width/19, y*width/19 * 6 + width/19, y*width/19 * 6 + width/19 * 6, y*width/19 * 6 + width/19 * 6, y*width/19 * 6}, 7);
            x++;
            if (y == 4)break;
            else if (x == 4){
                x = 0;
                y++;
            }
        }
    //    x=7;
    //    y=1;
    //    g.setColor(Color.red);
    //    g.fillPolygon(new int[] {x*width/19 , x*width/19 + width/38, (x+5)*width/19, (x+4)*width/19 + width/38, x*width/19}, new int[] {y*width/19 + width/38, y*width/19, (y+4)*width/19 + width/38, (y+5)*width/19, y*width/19 + width/38}, 5);
    //    g.fillPolygon(new int[] {x*width/19 , x*width/19 + width/38, (x+5)*width/19, (x+4)*width/19 + width/38, x*width/19}, new  int[] {(y+4)*width/19 + width/38, (y+5)*width/19, y*width/19 + width/38, y*width/19, (y+4)*width/19 + width/38}, 5 );
    }

    public static boolean drawX(int[] x, int[] y,  int width, Graphics g){
        g.setColor(Color.red);
        for (int i = 0; i < 5; i++) {
            try{
            g.fillPolygon(new int[]{x[i] * width / 19, x[i] * width / 19 + width / 38, (x[i] + 5) * width / 19, (x[i] + 4) * width / 19 + width / 38, x[i] * width / 19}, new int[]{y[i] * width / 19 + width / 38, y[i] * width / 19, (y[i] + 4) * width / 19 + width / 38, (y[i] + 5) * width / 19, y[i] * width / 19 + width / 38}, 5);
            g.fillPolygon(new int[]{x[i] * width / 19, x[i] * width / 19 + width / 38, (x[i] + 5) * width / 19, (x[i] + 4) * width / 19 + width / 38, x[i] * width / 19}, new int[]{(y[i] + 4) * width / 19 + width / 38, (y[i] + 5) * width / 19, y[i] * width / 19 + width / 38, y[i] * width / 19, (y[i] + 4) * width / 19 + width / 38}, 5);
        } catch (Exception e){
              break;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        TicTacToe minGrafik = new TicTacToe();

    }

    public class MyMouseMotionListener implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {
        }

        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    public class MyMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    public class MyKeyListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    }
}
//Footer
