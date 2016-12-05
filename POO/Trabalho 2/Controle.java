public class Controle 
{
	public static void main(String[] args)
	{
		S_Luz               sl = new S_Luz(2930, "Ecpc");
		S_Temperatura       st = new S_Temperatura(2416, "Impoterm", "Termo 3000");
		Sensor				se = new Sensor(st, sl);
		InteracaoUsuario    iu = new InteracaoUsuario();
		GerenciadorSensores gs = new GerenciadorSensores(iu, st, sl);
		
		int menuOption = 0;
		
		while (menuOption != Integer.MAX_VALUE)
		{
			menuOption = iu.solicitaInteiro("O que deseja fazer:"
					+ "\n1. Ligar o sensor de temperatura."
					+ "\n2. Parar execução do sensor de temperatura."
					+ "\n3. Ligar o sensor de luz."
					+ "\n4. Verificar se o sensor de temperatura está ligado."
					+ "\n5. Verificar se o sensor de luz está ligado."
					+ "\n6. Verificar se todos os sensores estão ligados."
					+ "\n7. Reiniciar o sensor de temperatura."
					+ "\n8. Reiniciar o sensor de luz."
					+ "\n9. Reiniciar todos os sensores."
					+ "\n\n(Digite 1, 2, 3, 4, 5, 6, 7, 8 ou 9)"
					+ "\n(Digite 0 ou clique em cancelar para sair)");
			
			switch( menuOption )
			{
				case 1:
				{
					gs.verificaTemperatura();
					break;
				}
				case 2:
				{
					gs.desligarSensorDeTemperatura();
					break;
				}
				case 3:
				{
					gs.verificaLuz();
					break;
				}
				case 4:
				{
					if (st.estaLigado())
						iu.informaUsuario("Está ligado.");
					else
						iu.informaUsuario("Não está ligado.");
					break;
				}
				case 5:
				{
					if (sl.estaLigado())
						iu.informaUsuario("Está ligado.");
					else
						iu.informaUsuario("Não está ligado.");
					break;
				}
				case 6:
				{
					if (se.estaLigado())
						iu.informaUsuario("Os dois sensores estão ligados.");
					else
						iu.informaUsuario("Pelo menos um dos sensores não está ligado.");
					break;
				}
				case 7:
				{
					st.reinicia();
					iu.informaUsuario("Sensor de temperatura reiniciado.");
					break;
				}
				case 8:
				{
					sl.reinicia();
					iu.informaUsuario("Sensor de luz reiniciado.");
					break;
				}
				case 9:
				{
					se.reinicia();
					iu.informaUsuario("Sensor de temperatura reiniciado."
									+ "\nSensor de luz reiniciado.");
					break;
				}
			}
			
			if( menuOption == 0 )
			{
				break;
			}
		}
	}
}
