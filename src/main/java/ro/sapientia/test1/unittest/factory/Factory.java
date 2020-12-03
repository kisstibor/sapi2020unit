package ro.sapientia.test1.unittest.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Factory {
	
	private static Map<Class<?>, Supplier<?>> typeMap = new HashMap<Class<?>, Supplier<?>>();

	public static Object create(Class<FNyomtato> className) {
		return typeMap.get(className).get();
	}
	
	public static void addMap(Class<?> clazz, Supplier<?> sp) {
		typeMap.put(clazz, sp);
	}

}
