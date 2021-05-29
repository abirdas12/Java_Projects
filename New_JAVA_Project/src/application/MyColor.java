package application;

import javafx.scene.paint.Color;

public enum MyColor {
	
	Aqua(0,255,255), 
	Black(0,0,0), 
	GreenYellow(173,255,47), 
	Brown(165,42,42), 
	Coral(255,127,80), 
	SkyBlue(135,206,250), 
	LimeGreen(50,255,50),
	red(255,0,0),  
	Navy(0,0,150),
	Khaki(240,230,140),
	DarkMagenta(139, 0, 139), 
	green(0,255,0), 
	Gold(212,175,55),
	Pink(255,192,203),
	Grey(128,128,128),
	Orange(255,165,0), 
	Purple(128,0,128),
	Chocolate(210,133,63), 
	SpringGreen(0,255,127), 
	Maroon(128,0,0), 
	Yellow(255,255,0), 
	OrangeRed (255,69,0),
	Peru(205,133,63),
	Violet(238,130,238),
	SlateGray(112,128,144),
	BlueViolet(138,43,226),
	Lightyellow(255,255,224),
	White(255,255,255), 
	blue(0,0,255);
	
	int Red;
	int Green; 
	int Blue;
	MyColor(int Red, int Green, int Blue) {
		this.Red = Red;
		this.Green = Green;
		this.Blue = Blue;
	}
	public Color getColor() {
		return Color.rgb(Red, Green, Blue);
	}
}



















//Color MyColor;
//this.MyColor = Color.rgb(Red, Green, Blue);
/*
public enum MyColor {
	Aqua(0,255,255), Black(0,0,0), GreenYellow(173,255,47), Brown(165,42,42), 
	Coral(255,127,80), SkyBlue(135,206,250), Lightyellow(255,255,224), red(255,0,0), 
	blue(0,0,255), Navy(0,0,150), DarkMagenta(139, 0, 139);
	
	int Red;
	int Green; 
	int Blue;
	//Color MyColor;
	MyColor(int Red, int Green, int Blue) {
		//this.MyColor = Color.rgb(Red, Green, Blue);
		this.Red = Red;
		this.Green = Green;
		this.Blue = Blue;
	}
	public Color getColor() {
		return Color.rgb(Red, Green, Blue);
	}
}
*/
