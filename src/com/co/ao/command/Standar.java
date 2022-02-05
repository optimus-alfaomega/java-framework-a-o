package src.com.co.ao.command;

import src.com.co.ao.input.Input;

import src.com.co.ao.output.Output;

public class Standar implements Command {

    private Class typeCommand;
    private Input input;
    private Output output;
    private boolean applyDebug;

    public Standar(Class typeCommand) {
        this.typeCommand = typeCommand;
    }

    @Override
    public Command init() {
        this.input = new src.com.co.ao.input.Standar();
        this.output = new src.com.co.ao.output.Standar();

        return this;
    }

    @Override
    public Command init(Input i, Output o) {
        this.input = i;
        this.output = o;
        return this;
    }

    @Override
    public Command exec() {
        return this;
    }

    @Override
    public Command exec(Object[] args) {
        try {
            this.input.function(args);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.output.write("");
        return this;
    }

    public Command exec(String[] args) {
        return this;
    }

    @Override
    public Command hold() {
        // TODO Auto-generated method stub
        return this;
    }

    @Override
    public Command stop() {
        // TODO Auto-generated method stub
        return this;
    }

    @Override
    public Command log() {
        // TODO Auto-generated method stub
        return this;
    }

    @Override
    public Command start() {
        // TODO Auto-generated method stub
        return this;
    }

    @Override
    public Command type(Class type) {
        this.typeCommand = type;
        return this;
    }

    @Override
    public Command debug(boolean onoff) {
        this.applyDebug = onoff;
        return this;
    }

    @Override
    public Command cleanAll() {

        this.applyDebug = false;
        this.input = null;
        this.output = null;

        return this;
    }

    public Class getTypeCommand() {
        return this.typeCommand;
    }

    public Input getInput() {
        return this.input;
    }

    public Output getOutput() {
        return this.output;
    }

    public boolean isApplyDebug() {
        return this.applyDebug;
    }

}
