public class ReceptorMasterCard implements Receptor
{
	@Override
	public String receber() 
	{
		System.out.println("Recebendo mensagem da MasterCard. ");
		String mensagem = "Mensagem da MasterCard";
		return mensagem;
	}
}
