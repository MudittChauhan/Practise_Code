import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class AppletExample extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.green);
		g.drawString("Mudit Chauhan", 30, 30);
		g.drawOval(60, 60, 100, 120);
		g.setColor(Color.red);
		g.fillOval(260, 60, 100, 120);
		g.fillRect(100, 50, 120, 60);
		
	}
}