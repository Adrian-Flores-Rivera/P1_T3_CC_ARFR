public class Main {
    public static void main(String[] args){
        int OperacionIndex = 0;
        do {
            String operacion = args[OperacionIndex];
            int dato1 = Integer.parseInt(args[OperacionIndex + 1]);     //Integer.parseInt() convierte de una cadena a entero
            int dato2 = Integer.parseInt(args[OperacionIndex + 2]);

            switch (operacion) {
                case "SUMA" -> System.out.println(dato1 + " + " + dato2 + " = " + (dato1 + dato2));
                case "RESTA" -> System.out.println(dato1 + " - " + dato2 + " = " + (dato1 - dato2));
                case "MULTIPLICACION" -> System.out.println(dato1 + " * " + dato2 + " = " + (dato1 * dato2));
                case "DIVISION" -> System.out.println(dato1 + " / " + dato2 + " = " + (dato1 / dato2));
            }
            OperacionIndex += 3;
        }while(OperacionIndex < args.length);
    }
}