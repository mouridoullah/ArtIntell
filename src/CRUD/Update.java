package CRUD;

import java.util.Map;

import entreprise.Employer;

public class Update {
	public static Employer ServiceUpdate(Map<Integer,Employer> map, Integer integer, Employer employer){
		if (!map.containsKey(integer)) throw new IllegalStateException("La clé "+integer+" n'existe pas dans notre set.");
		if (employer == null) throw new IllegalArgumentException("Value cannot be null.");
		
		return map.put(integer, employer);
	}
}
