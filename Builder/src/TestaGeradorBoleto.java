public class TestaGeradorBoleto
{
	public static void main(String[] args)
	{
		BoletoBuilder boletoBuilder = new BancoDoBrasilBoletoBuilder();
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
		Boleto boleto = geradorDeBoleto.gerarBoleto();
		System.out.println(boleto);
		
	}
}
