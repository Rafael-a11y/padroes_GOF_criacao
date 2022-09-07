public class EmissorMasterCard implements Emissor
{
	@Override
	public void enviar(String mensagem) 
	{
		System.out.println("Enviando a seguinte mensagem para a MasterCard: ");
		System.out.println(mensagem);
	}
}
