package name.bychkov.junit5;

import java.util.Locale;
import java.util.function.Function;

@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_1")
@CheckConstructor(targetClass = ChildSimpleDTO.class)
@CheckMethod(targetClass = ChildSimpleDTO.class, value = "finalMethod4", returnType = void.class)
public class App
{
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_1")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_2")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_3")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_4")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_5")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_6")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_7")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_8")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable1")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable2")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable3")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable4")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable5")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable6")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable7")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable8")
	@CheckConstructor(targetClass = ParentSimpleDTO.class)
	@CheckConstructor(targetClass = ParentSimpleDTO.class, parameters = String.class)
	@CheckConstructor(targetClass = ParentSimpleDTO.class, parameters = { String.class, float.class })
	@CheckConstructor(targetClass = ParentSimpleDTO.class, parameters = { String.class, double[].class })
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod1", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod2")
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod3", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod4", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod5", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod6", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod7", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod8", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "finalMethod1", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "finalMethod2", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "finalMethod3", returnType = Locale.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "finalMethod4", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method1", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method2", returnType = ParentSimpleDTO.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method3", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method4", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method1WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method2WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method3WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method4WithParams", returnType = String.class, parameters = { Function.class, String.class, byte.class })
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_1")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_2")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_3")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_4")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_5")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_6")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_7")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_8")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable1")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable2")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable3")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable4")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable5")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable6")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable7")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable8")
	@CheckConstructor(targetClass = ChildSimpleDTO.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method1", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method2", returnType = ParentSimpleDTO.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method3", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method4", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method1WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method2WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method3WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method4WithParams", returnType = String.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod1", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod2", returnType = String.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod3", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod4", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod5", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod6", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod7", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod8", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "finalMethod1", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "finalMethod2", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "finalMethod3", returnType = Locale.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "finalMethod4", returnType = void.class)
	private String field;
	
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_1")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_2")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_3")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_4")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_5")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_6")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_7")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_8")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable1")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable2")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable3")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable4")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable5")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable6")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable7")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable8")
	@CheckConstructor(targetClass = ParentSimpleDTO.class)
	@CheckConstructor(targetClass = ParentSimpleDTO.class, parameters = String.class)
	@CheckConstructor(targetClass = ParentSimpleDTO.class, parameters = { String.class, float.class })
	@CheckConstructor(targetClass = ParentSimpleDTO.class, parameters = { String.class, double[].class })
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod1", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod2", returnType = String.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod3", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod4", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod5", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod6", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod7", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod8", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "finalMethod1", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "finalMethod2", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "finalMethod3", returnType = Locale.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "finalMethod4", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method1", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method2", returnType = ParentSimpleDTO.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method3", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method4", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method1WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method2WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method3WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method4WithParams", returnType = String.class, parameters = { Function.class, String.class, byte.class })
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_1")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_2")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_3")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_4")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_5", type = Long.class)
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_6")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_7")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_8")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable1")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable2")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable3")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable4")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable5")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable6")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable7")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable8")
	@CheckConstructor(targetClass = ChildSimpleDTO.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method1", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method2", returnType = ParentSimpleDTO.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method3", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method4", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method1WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method2WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method3WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method4WithParams", returnType = String.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod1", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod2", returnType = String.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod3", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod4", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod5", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod6", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod7", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod8", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "finalMethod1", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "finalMethod2", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "finalMethod3", returnType = Locale.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "finalMethod4", returnType = void.class)
	public App()
	{
	}
	
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_1")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_2")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_3")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_4")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_5")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_6")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_7")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "CONSTANT_8")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable1")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable2")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable3")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable4")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable5")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable6")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable7")
	@CheckField(targetClass = ParentSimpleDTO.class, value = "variable8")
	@CheckConstructor(targetClass = ParentSimpleDTO.class)
	@CheckConstructor(targetClass = ParentSimpleDTO.class, parameters = String.class)
	@CheckConstructor(targetClass = ParentSimpleDTO.class, parameters = { String.class, float.class })
	@CheckConstructor(targetClass = ParentSimpleDTO.class, parameters = { String.class, double[].class })
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod1", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod2", returnType = String.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod3", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod4", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod5", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod6", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod7", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "staticMethod8", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "finalMethod1", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "finalMethod2", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "finalMethod3", returnType = Locale.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "finalMethod4", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method1", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method2", returnType = ParentSimpleDTO.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method3", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method4", returnType = void.class)
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method1WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method2WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method3WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ParentSimpleDTO.class, value = "method4WithParams", returnType = String.class, parameters = { Function.class, String.class, byte.class })
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_1")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_2")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_3")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_4")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_5")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_6")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_7")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "CONSTANT_8")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable1")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable2")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable3")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable4")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable5")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable6")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable7")
	@CheckField(targetClass = ChildSimpleDTO.class, value = "variable8")
	@CheckConstructor(targetClass = ChildSimpleDTO.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method1", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method2", returnType = ParentSimpleDTO.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method3", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method4", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method1WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method2WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method3WithParams", returnType = void.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "method4WithParams", returnType = String.class, parameters = { Function.class, String.class, byte.class })
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod1", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod2", returnType = String.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod3", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod4", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod5", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod6", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod7", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "staticMethod8", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "finalMethod1", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "finalMethod2", returnType = void.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "finalMethod3", returnType = Locale.class)
	@CheckMethod(targetClass = ChildSimpleDTO.class, value = "finalMethod4", returnType = void.class)
	public static void main(String[] args) throws NoSuchMethodException, SecurityException
	{
	}
}