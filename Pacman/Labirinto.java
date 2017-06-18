import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class Labirinto
{
	private Image imagem;
	
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
}
