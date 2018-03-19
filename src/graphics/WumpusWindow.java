package graphics;

import java.awt.Color;

import javax.swing.JFrame;

public class WumpusWindow extends JFrame{
	private int height;
	private int width;
	private DisplayFrame mainFrame;
	
	
	public WumpusWindow(int width, int height) {
		this.height = height;
		this.width = width;
		setSize(this.width, this.height);
		setBackground(Color.LIGHT_GRAY);
		setResizable(false);
		setUndecorated(true);
		setVisible(true);
	
		mainFrame = new DisplayFrame(width, height);
		add(mainFrame);
	}
	
	
	
	
	
	public DisplayFrame getFrame() {
		return mainFrame;
	}
	
	@Override
	public int getWidth() {
		return width;
	}
	
	@Override
	public int getHeight() {
		return height;
	}
}