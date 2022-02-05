package src.com.co.ao.command;

import src.com.co.ao.input.Function;

public class ExecPython extends Standar {

    public ExecPython() {
        super(ExecPython.class);

    }

    @Override
    public Command stop() {
        return this;
    }

    @Override
    public Command exec(String[] args) {

        try {
            this.getInput().function(args);
        } catch (Exception e) {

            e.printStackTrace();
        }

        return this;
    }

    @Override
    public Command exec() {

        try {
            this.getInput().function(null);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return this;
    }

}
