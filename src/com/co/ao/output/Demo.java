package src.com.co.ao.output;

public class Demo {

    public static void main(String[] args) {

        Output output = new Standar();
        output.write("Ejecución exitosa, proceso entregado").log().write("otro mensaje").log();

    }

}
