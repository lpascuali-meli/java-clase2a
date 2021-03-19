package meli.java;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c, int n)
	{
		String str = "";
		for (int i = 0; i < n; i++) {
			str += c;
		}
		return str;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		return replicate(c, n - s.length()) + s;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		String strArr[] = new String[arr.length];
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = Integer.toString(arr[i]);
		}
		return strArr;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int intArr[] = new int [arr.length];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}
		return intArr;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		String maxValue = "";
		for (int i = 0; i < arr.length; i++) {
			if (maxValue.length() < arr[i].length()) {
				maxValue = arr[i];
			}
		}
		return maxValue.length();
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
		for (int i = 0; i < arr.length; i++) {
			arr[i] = lpad(arr[i], maxLength(arr), c);
		}
	}


	// NUEVAS FUNCIONES - Clase 2
	// Retorna una cadena de longitud n, compuesta por s
	// y seguida de tantos caracteres c como sea necesario
	public static String rpad(String s, int n, char c)
	{
		return s + replicate(c, n - s.length());
	}

	/*
		Retorna una cadena sin espacios al principio
	 */
	public static String ltrim(String s)
	{
		return s.replaceAll("^\\s+", "");
	}

	/*
		Retorna una cadena sin espacios al principio
	 */
	public static String rtrim(String s)
	{
		return s.replaceAll("\\s+$", "");
	}

	/*
		Retorna una cadena sin espacios al principio
	 */
	public static String trim(String s)
	{
		return s.replaceAll("^\\s+|\\s+$", "");
	}

	public static int indexOfN(String s,char c,int n) {
		int ocurrencia = 0;
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				ocurrencia++;
				index = i;
				if (ocurrencia == n) break;
			}
		}
		return	ocurrencia == n ? index : -1;
	}

}
