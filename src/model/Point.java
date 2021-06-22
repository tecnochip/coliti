package model;

//clase  para definir las coordenadas X e Y de un punto

public class Point {
	private int x = 0;
	private int y = 0;
	
//constructor
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
