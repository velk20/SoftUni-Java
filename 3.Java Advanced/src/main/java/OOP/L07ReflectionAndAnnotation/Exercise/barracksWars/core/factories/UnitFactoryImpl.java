package OOP.L07ReflectionAndAnnotation.Exercise.barracksWars.core.factories;

import OOP.L07ReflectionAndAnnotation.Exercise.barracksWars.interfaces.Unit;
import OOP.L07ReflectionAndAnnotation.Exercise.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"OOP.L07ReflectionAndAnnotation.Exercise.barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		Class unit = Class.forName(UNITS_PACKAGE_NAME + unitType);
		Constructor declaredConstructor = unit.getDeclaredConstructor();
		declaredConstructor.setAccessible(true);
		Unit unnit = (Unit) declaredConstructor.newInstance();
		if (unnit!=null) return unnit;
		else
		throw new ExecutionControl.NotImplementedException("message");
	}
}
