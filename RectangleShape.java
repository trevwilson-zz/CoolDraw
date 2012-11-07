import java.awt.*;
import javax.swing.*;

public class RectangleShape extends Shape{

	int centerX, centerY;
	
	public RectangleShape(int x, int y){
		centerX = x;
		centerY = y;
	}
	
	public void draw(Color color, Graphics g){
		g.setColor(color);
		g.drawRect(centerX - 30, centerY - 20, 60, 40);
		g.fillRect(centerX - 30, centerY - 20, 60, 40);
		
	}
	
}