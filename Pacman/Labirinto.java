import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Labirinto
{
	private Image imagem;
	
	BufferedImage img = null;
	
	URL urlParaImagem;
    ImageIcon imagemIcone;
    
    public void carregarImagem(String img)
	{
		urlParaImagem = getClass().getResource("./images/" + img + ".jpg");
        imagemIcone = new ImageIcon(urlParaImagem);
        imagem = imagemIcone.getImage();
	}
    
    public Image labirinto()
    {
    	carregarImagem("Labirinto");
    	return imagem;
    }
    
    public BufferedImage BufImagem()
    {
    	try
    	{
    	URL url = getClass().getResource("./images/" + "Labirinto.jpg");
    	img = ImageIO.read(url);
    	} catch (IOException e) {}
    	return img;
    }
    
    public int Rgb()
    {
    	Color mycolor = new Color(this.BufImagem().getRGB(40, 40));
		int red = mycolor.getRed();
		int green = mycolor.getGreen();
		int blue = mycolor.getBlue();
		System.out.println(red + " " + green + " " + blue);// teste
		return red + green + blue;
    }
}
