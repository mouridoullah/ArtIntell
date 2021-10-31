package CRUD;

import java.util.Map;

import entreprise.Employer;

public class Create {
	
	public static void ServiceAdd(Map<Integer,Employer> map, Integer integer, Employer employer){
		if (map.containsKey(integer)) throw new IllegalStateException("L'employer "+integer+" existe déjà !");
		if (employer == null) throw new IllegalArgumentException("L'employer ne peut pas être nul");
		
		map.put(integer, employer);
	}
}
