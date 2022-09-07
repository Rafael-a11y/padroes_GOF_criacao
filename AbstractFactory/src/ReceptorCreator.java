public class ReceptorCreator 
{
	public static final int VISA = 0; 
	public static final int MASTERCARD = 1;
	
	public Receptor create(int tipoDeReceptor)
	{
		if(tipoDeReceptor == ReceptorCreator.VISA) return new ReceptorVisa();
		else if(tipoDeReceptor == ReceptorCreator.MASTERCARD) return new ReceptorMasterCard();
		else throw new IllegalArgumentException("Tipo de receptor não suportado");
	}
}
