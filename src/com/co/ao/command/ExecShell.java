package src.com.co.ao.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecShell extends Standar {

    public ExecShell() {
        super(ExecShell.class);
    }

    @Override
    public Command stop() {
        return this;
    }

    @Override
    public Command exec(String[] args) {

        try {
            String command = this.getInput().getCommand() == null ? "" : this.getInput().getCommand();

            for (int a = 0; a < args.length; a++)
                command = command + " " + args[a];

            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                this.getOutput().write(line);
               
            }
            this.getOutput().log();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return this;
    }

}
