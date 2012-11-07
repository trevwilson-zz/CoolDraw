import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CoolDraw{

	public static void main(String[] args){
		MenuBar myMenuBar = new MenuBar();
		JMenuBar menuBar = myMenuBar.getMenuBar();
			
		JFrame f = new JFrame("Cool Draw - Wilson - Fall 2011");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setJMenuBar(menuBar);
		f.getContentPane().add(new CoordinatePanel(myMenuBar));
		
		f.setVisible(true);
		
		/*
		circleButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				TriangleShape newTri = new TriangleShape(f,100,100);
				Graphics graphic = new Graphics();
				newTri.draw(currentColor, graphic);
			}
		});*/
	}
		
}