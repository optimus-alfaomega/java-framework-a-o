package src.com.co.ao.command;

import src.com.co.ao.input.Input;
import src.com.co.ao.output.Output;

public interface Command {

    public Command init();

    public Command init(Input i, Output o);

    public Command exec();

    public Command exec(Object[] args);

    public Command exec(String[] args);

    public Command hold();

    public Command stop();

    public Command log();

    public Command start();

    public Command type(Class type);

    public Command debug(boolean onoff);

    public Command cleanAll();

}
