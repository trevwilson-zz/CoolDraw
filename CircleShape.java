import java.awt.*;
import javax.swing.*;

public class CircleShape extends Shape{

	int centerX, centerY;

	public CircleShape(int x, int y){
		centerX = x;
		centerY = y;
	}
	
	public void draw(Color color, Graphics g){
		g.setColor(color);
		g.drawOval(centerX - 30, centerY - 20, 60, 60);
		g.fillOval(centerX - 30, centerY - 20, 60, 60);
		
	}
	
}