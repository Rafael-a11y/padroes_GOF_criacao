import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BancoDoBrasilBoleto implements Boleto 
{
	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento;
	private int nossoNumero;
	
	public BancoDoBrasilBoleto(String sacado, String cedente, double valor, Calendar vencimento, int nossoNumero) 
	{
		this.sacado = sacado;
		this.cedente = cedente;
		this.valor = valor;
		this.vencimento = vencimento;
		this.nossoNumero = nossoNumero;
	}

	@Override
	public String getSacado() 
	{
		return this.sacado;
	}

	@Override
	public String getCedente() 
	{
		return this.cedente;
	}

	@Override
	public double getValor() 
	{
		return this.valor;
	}

	@Override
	public Calendar getVencimento() 
	{
		return this.vencimento;
	}

	@Override
	public int getNossoNumero() 
	{
		return this.nossoNumero;
	}
	//Lembrando que o StringBuilder builder serve apenas para concatenar os valores, não esta,mos estudando este objeto neste padrão
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Boleto Banco do Brasil");
		builder.append("\n");
		
		builder.append("Sacado: " + this.sacado);
		builder.append("\n");
		
		builder.append("Cedente: " + this.cedente);
		builder.append("\n");
		
		builder.append("Valor: " + this.valor);
		builder.append("\n");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String format = simpleDateFormat.format(this.vencimento.getTime());
		builder.append("Vencimento: " + format);
		builder.append("\n");
		
		builder.append("NossoNumero: " + this.nossoNumero);
		builder.append("\n");
		
		return builder.toString();
	}
	
	
}
