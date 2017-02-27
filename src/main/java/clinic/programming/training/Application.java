package clinic.programming.training;


import java.util.HashMap;
import java.util.Set;

public class Application{

	public void dupli(String str)
	{
		char[] chr = str.toCharArray();
		HashMap<Character, Integer> dup = new HashMap<>();
		for (Character ch:chr)
		{
			if(dup.containsKey(ch)){
				dup.put(ch, dup.get(ch)+1);
			}
			else
			{
				dup.put(ch, 1);

			}
		}
		
		System.out.println(dup);

		//Set<Character> keys= dup.keySet();
		//for (Character ch: keys){
		
				//System.out.println(ch+"---->"+ dup.get(ch));
			
		//}
		
	}
		public static void main(String [] args){
			
			Application dc = new Application();
			dc.dupli("bfybfyuqeifwdgvd");
		
		}
}
