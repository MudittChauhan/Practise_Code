import java.applet.Applet;
import java.awt.Graphics;
public class AppletParam extends Applet
{
	public void init()
	{
		
	}
	String s;
	public void start()
	{
		s=getParameter("usrname");
	}
	public void paint(Graphics g)
	{
		g.drawString(s, 30, 30);
	}
}
