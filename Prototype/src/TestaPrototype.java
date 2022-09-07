import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class TestaPrototype
{
	public static void main(String[] args)
	{
		String nome = "K19";
		
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		
		Set<String> hashSet = new HashSet<>();
		String[] array = {"curso", "Java", "K19"};
		
		for (int i = 0; i < array.length; i++)
		{
			hashSet.add(array[i]);
		}
		
		Campanha campanha = new Campanha(nome, vencimento, hashSet);
		System.out.println(campanha);
		
		Campanha clone = campanha.clone();
		System.out.println(clone);
	}
}
