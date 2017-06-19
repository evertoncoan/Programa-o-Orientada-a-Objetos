import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Labirinto
{
	private BufferedImage img = null;
	private Image imagem;	
	private URL urlParaImagem;
    private ImageIcon imagemIcone;
    
    public void carregarImagem(String img)
	{
		urlParaImagem = getClass().getResource("./images/" + img + ".png");
        imagemIcone = new ImageIcon(urlParaImagem);
        imagem = imagemIcone.getImage();
	}
    
    public Image labirinto()
    {
    	carregarImagem("LabirintoV3");
    	return imagem;
    }
    
    public BufferedImage BufImagem()
    {
    	try
    	{
    	URL url = getClass().getResource("./images/" + "LabirintoV3.png");
    	img = ImageIO.read(url);
    	} catch (IOException e) {}
    	return img;
    }
    
    public int Rgb(int x, int y)
    {
    	Color mycolor = new Color(this.BufImagem().getRGB(x, y));
		int red = mycolor.getRed();
		int green = mycolor.getGreen();
		int blue = mycolor.getBlue();
		//System.out.println(red + " " + green + " " + blue);// teste
		//System.out.println(red + green + blue);// teste
		return red + green + blue;
    }
}
