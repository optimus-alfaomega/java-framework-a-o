package src.com.co.ao.command;

import org.python.util.PythonInterpreter;

import src.com.co.ao.input.Function;
import src.com.co.ao.input.Input;
import src.com.co.ao.output.Output;

public class Demo {
    public static void main(String[] args) {

        /*
         * Funcion con paso de parametros
         * Function f = new Function() {
         * 
         * public Input function(Object[] args) throws Exception {
         * 
         * try (PythonInterpreter pyInterp = new PythonInterpreter()) {
         * pyInterp.exec("print('Hello" + args[0].toString() + "Python World!')");
         * }
         * 
         * return this;
         * }
         * 
         * };
         */

        /*
         * Funcion simple con Python!!
         * Function f = new Function() {
         * 
         * @Override
         * public Input function(Object[] args) throws Exception {
         * 
         * try (PythonInterpreter pyInterp = new PythonInterpreter()) {
         * pyInterp.exec("print('Hello Python World!')");
         * }
         * 
         * return this;
         * }
         * };
         */

        ExecPython python = new ExecPython();
        String[] args2 = new String[1];
        args2[0] = " Alex ";
        python.init(f, new src.com.co.ao.output.Standar()).exec(args2);

        /*
         * Ejemplo de comando
         * 
         * System.out.println("hola mundo");
         * String[] comandos = new String[2];
         * comandos[0] = "ping";
         * comandos[1] = "www.google.com";
         * String comando2[] = new String[1];
         * comando2[0] = "date";
         * new ExecShell().init().exec(comandos).cleanAll();
         * new ExecShell().init().exec(comando2).cleanAll();
         */

    }

}
