package CRUD;

import java.util.Map;

import entreprise.Employer;

public class Read {
	public static boolean ServiceRead(Map<Integer,Employer> map, Integer integer){
		return map.containsKey(integer);
	}
}
