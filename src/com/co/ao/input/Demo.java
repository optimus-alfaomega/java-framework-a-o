package src.com.co.ao.input;

import src.com.co.ao.input.Function;

public class Demo {
    public static void main(String[] args) {

        Function f = new Function() {

            @Override
            public Input function(Object[] args) throws Exception {

                int a, b;
                a = 3;
                b = 4;
                System.out.println(a * b);

                return this;
            }
        };

        try {
            f.function(null);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Input standar = new Standar();
        standar.date("20--01-2022").description("job de trabajo estandar").filename(
                "job.txt").hour("1020").path("c:\\")
                .name("job1");
        standar.command("ping");
        System.out.println(standar.getCommand());

    }
}