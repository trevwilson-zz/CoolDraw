import java.awt.*;
import javax.swing.*;

public class TriangleShape extends Shape{

	int centerX, centerY;
	int[] xCoordinates = new int[3];
	int[] yCoordinates = new int[3];
	
	public TriangleShape(int x, int y){
		centerX = x;
		centerY = y;
		xCoordinates[0] = centerX;
		yCoordinates[0] = centerY - 25;
		xCoordinates[1] = centerX - 25;
		yCoordinates[1] = centerY + 25;
		xCoordinates[2] = centerX + 25;
		yCoordinates[2] = centerY + 25;
	}
	
	public void draw(Color color, Graphics g){
		g.setColor(color);
		g.drawPolygon(xCoordinates, yCoordinates, 3);
		g.fillPolygon(xCoordinates, yCoordinates, 3);
	}
	
}