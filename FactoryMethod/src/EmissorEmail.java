
public class EmissorEmail implements Emissor
{
	@Override
	public void enviar(String mensagem)
	{
		System.out.println("Enviando por Email a mensagem: ");
		System.out.println(mensagem);
	}
}
