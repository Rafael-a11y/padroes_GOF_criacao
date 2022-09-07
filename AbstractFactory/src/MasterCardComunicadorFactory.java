public class MasterCardComunicadorFactory implements ComunicadorFactory
{
	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();
	
	@Override
	public Emissor createEmissor()
	{
		return emissorCreator.create(EmissorCreator.MASTERCARD); 
	}

	@Override
	public Receptor createReceptor()
	{
		return receptorCreator.create(ReceptorCreator.MASTERCARD);
	}
	
}
