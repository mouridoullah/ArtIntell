package CRUD;

import java.util.Map;

import entreprise.Employer;

public class Delete {
	public static boolean ServiceDelete(Map<Integer,Employer> map, Integer integer){
		return map.remove(integer) != null;
	}
}
