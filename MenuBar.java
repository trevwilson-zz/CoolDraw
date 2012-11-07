import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MenuBar{

	JMenuBar menuBar;
	JMenu fileMenu, shapeMenu, colorMenu, helpMenu;
	JMenuItem exitButton, circleButton, rectangleButton, triangleButton, greenButton, yellowButton, purpleButton, aboutButton;
	boolean circleButtonState = true, rectangleButtonState, triangleButtonState, greenButtonState = true, yellowButtonState, purpleButtonState;
	
	public MenuBar(){
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		shapeMenu = new JMenu("Add Shapes");
		colorMenu = new JMenu("Color");
		helpMenu = new JMenu("Help");
		exitButton = new JMenuItem("Exit");
		circleButton = new JRadioButtonMenuItem("Circle", true);
		rectangleButton = new JRadioButtonMenuItem("Rectangle");
		triangleButton = new JRadioButtonMenuItem("Triangle");
		greenButton = new JRadioButtonMenuItem("Green", true);
		yellowButton = new JRadioButtonMenuItem("Yellow");
		purpleButton = new JRadioButtonMenuItem("Purple");
		aboutButton = new JMenuItem("About");
		fileMenu.add(exitButton);
		ButtonGroup shapeChoices = new ButtonGroup();
		shapeChoices.add(circleButton);
		shapeChoices.add(rectangleButton);
		shapeChoices.add(triangleButton);
		ButtonGroup colorChoices = new ButtonGroup();
		colorChoices.add(greenButton);
		colorChoices.add(yellowButton);
		colorChoices.add(purpleButton);
		shapeMenu.add(circleButton);
		shapeMenu.add(rectangleButton);
		shapeMenu.add(triangleButton);
		colorMenu.add(greenButton);
		colorMenu.add(yellowButton);
		colorMenu.add(purpleButton);
		helpMenu.add(aboutButton);
		menuBar.add(fileMenu);
		menuBar.add(shapeMenu);
		menuBar.add(colorMenu);
		menuBar.add(helpMenu);
		exitButton.addActionListener(new exitButtonListener());
		exitButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
		triangleButton.addActionListener(new shapeListener());
		triangleButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
		rectangleButton.addActionListener(new shapeListener());
		rectangleButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
		circleButton.addActionListener(new shapeListener());
		circleButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		greenButton.addActionListener(new colorListener());
		greenButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
		yellowButton.addActionListener(new colorListener());
		yellowButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK));
		purpleButton.addActionListener(new colorListener());
		purpleButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
		aboutButton.addActionListener(new aboutButtonListener());
		aboutButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));

	}
	
	public JMenuBar getMenuBar(){
		return menuBar;
	}
	
	public String getShape(){
		if(circleButtonState){
			return "Circle";
		}
		else if(rectangleButtonState){
			return "Rectangle";
		}
		else if(triangleButtonState){
			return "Triangle";
		}
		return null;
	}
	
	public Color getColor(){
		if(greenButtonState){
			return Color.green;
		}
		else if(yellowButtonState){
			return Color.yellow;
		}
		else if(purpleButtonState){
			return Color.magenta;
		}
		return null;
	}
	
	private class shapeListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == circleButton){
				circleButtonState = true;
				rectangleButtonState = false;
				triangleButtonState = false;
			}
			else if(event.getSource() == triangleButton){
				circleButtonState = false;
				rectangleButtonState = false;
				triangleButtonState = true;
			}
			else if(event.getSource() == rectangleButton){
				circleButtonState = false;
				rectangleButtonState = true;
				triangleButtonState = false;
			}
		}
	}
	
	private class colorListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == greenButton){
				greenButtonState = true;
				yellowButtonState = false;
				purpleButtonState = false;
			}
			else if(event.getSource() == yellowButton){
				greenButtonState = false;
				yellowButtonState = true;
				purpleButtonState = false;
			}
			else if(event.getSource() == purpleButton){
				greenButtonState = false;
				yellowButtonState = false;
				purpleButtonState = true;
			}
		}
	}
	
	private class exitButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			System.exit(0);
		}
	}
	
	private class aboutButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JFrame popUp = new JFrame("About");
			JLabel aboutText = new JLabel("<html>Name: CoolDraw<br>Author: Trevor Wilson<br>Instructions: Add colored shapes to the frame by selecting<br>the shape and color from the menu bar and then clicking<br>where you would like the shape to be</html>");
			popUp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			popUp.add(aboutText);
			popUp.pack();
			popUp.setVisible(true);
		}
	}

}