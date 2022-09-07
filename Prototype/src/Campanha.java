import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Campanha implements Prototype<Campanha>
{
	
	private String nome;
	private Calendar vencimento;
	private Set<String> palavrasChave;
	
	
	public Campanha(String nome, Calendar vencimento, Set<String> palavrasChave) 
	{
		this.nome = nome;
		this.vencimento = vencimento;
		this.palavrasChave = palavrasChave;
	}

	public String getNome() 
	{
		return nome;
	}

	public Calendar getVencimento() 
	{
		return vencimento;
	}

	public Set<String> getPalavrasChave() 
	{
		return palavrasChave;
	}

	@Override public Campanha clone()
	{
		String nome = "Cópia da campanha: " + this.nome;
		Calendar vencimento = (Calendar) this.vencimento.clone();
		Set<String> palavrasChave = new HashSet<>(this.palavrasChave);
		return new Campanha(nome, vencimento, palavrasChave);
	}
	
	@Override public  String toString()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String format = sdf.format(this.vencimento.getTime());
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("---------------------\nNome da campanha: " + this.nome + "\nVencimento: " + format + "\nPalavras-chave: \n");
		for(String palavra : this.palavrasChave)
		{
			buffer.append(" - " + palavra + "\n");
		}
		buffer.append("---------------------\n");
		
		return buffer.toString();
	}
}
