
import java.awt.Graphics;
import java.awt.Color;
import java.util.*;
public class Projectile {

	public static void main(String[] args) {
		drawprojectile();
	}
	public static void drawprojectile() {
		DrawingPanel panel = new DrawingPanel(500, 500);
		Graphics g = panel.getGraphics();
		double vectory,vectorx;
		Scanner input = new Scanner(System.in);
        System.out.print("Enter angle: ");
		double angle = input.nextDouble();//input angle
		System.out.print("Enter velocity: ");
		double velocity = input.nextDouble();//input velocity
	
		double gravity;
		gravity= - 9.8;

        vectorx = velocity * Math.cos(Math.toRadians(angle));
        vectory = velocity * Math.sin(Math.toRadians(angle));
        System.out.println(" vectorx " + vectorx);
		System.out.println(" vectory " + vectory);
        double totalTime = - 2.0 * vectory / gravity;
        System.out.println(" totalTime " + totalTime);
        double dT = totalTime / 50;
		
        double x = 0.0;
        double y = 0.0;
        double t = 0.0;
		 for (int i = 0; i <=500; i++) {   
	        
			    t += dT;
	            x = vectorx * t;
	            y = y + (vectory * t + (0.5 * gravity * t * t));
	            g.drawOval((int)(x), (500 - (int)(y)), 5, 5);
			    g.fillOval((int)(x), (500 - (int)(y)), 5, 5);
		        g.setColor(Color.WHITE);
		        panel.sleep(100);
		        g.drawOval((int)(x), (500 - (int)(y)), 5, 5);
			    g.fillOval((int)(x), (500 - (int)(y)), 5, 5);
		        g.setColor(Color.BLUE);

		   
		 }
		 
	}
	
}

