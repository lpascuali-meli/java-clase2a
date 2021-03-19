package meli.java;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Test 1
        System.out.println("TEST 1:");
        CuentaCorriente cc1 = new CuentaCorriente(100);
        CuentaCorriente cc2 = new CuentaCorriente(100);
        cc1.ingreso(10);
        cc2.egreso(20);
        cc2.transferencia(50, cc1);
        System.out.println(cc1.getSaldo());
        System.out.println(cc2.getSaldo());

        // Test 2
        System.out.println("TEST 2:");
        Contador c1 = new Contador();
        c1.incrementar();
        c1.incrementar();
        c1.incrementar();
        System.out.println(c1.getValor());

        // Test 3
        System.out.println("TEST 3:");
        Libro libro = new Libro();
        libro.setAutor("Cortazar");
        libro.setTitulo("Rayuela");
        libro.setIsbn("0918uiqhqbn");
        System.out.println(libro.toString());

        // Test 4
        System.out.println("TEST 4:");
        Fraccion fr = new Fraccion(4, 5);
        System.out.println(fr.multiplicar(5).toString());
        System.out.println(fr.dividir(4).toString());
        System.out.println(fr.sumar(2).toString());
        System.out.println(fr.restar(1).toString());

        // Test 5
        System.out.println("TEST 5:");
        Fecha fecha = new Fecha(1, 1, 2000);
        System.out.println(fecha.toString());
        fecha.addDay();
        System.out.println(fecha.toString());
        fecha.setMonth(9999);
        System.out.println(fecha.isValid() ? "Es válida" : "No es válida");


        // Test 6
        System.out.println("TEST 6:");
        System.out.println(StringUtil.rpad("aaa", 5, 'c'));
        System.out.println(StringUtil.ltrim("   aaa  aa   "));
        System.out.println(StringUtil.rtrim("   aaa  aa   "));
        System.out.println(StringUtil.trim("   aaa  aa   "));
        System.out.println(StringUtil.indexOfN("John|Paul|George|Ringo", 'z', 2));
    }
}
