package src.com.co.ao.input;

public class Standar implements Input {

    private String name;
    private String description;
    private String path;
    private String filename;
    private String hour;
    private String date;
    private String command;

    @Override
    public Input name(String name) {

        this.name = name;
        return this;
    }

    @Override
    public Input description() {
        System.out.println(this.description);
        return this;
    }

    @Override
    public Input description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public Input path() {

        System.out.println(this.path());

        return this;
    }

    @Override
    public Input path(String path) {
        this.path = path;
        return this;
    }

    @Override
    public Input filename() {
        System.out.println(this.filename);
        return this;
    }

    @Override
    public Input filename(String filename) {
        this.filename = filename;
        return this;
    }

    @Override
    public Input function(Object[] args) throws Exception {

        return this;
    }

    @Override
    public Input hour() {
        System.out.println(this.hour);
        return this;
    }

    @Override
    public Input hour(String hour) {
        this.hour = hour;
        return this;
    }

    @Override
    public Input date() {
        System.out.println(this.date);
        return this;
    }

    @Override
    public Input date(String date) {
        this.date = date;
        return this;
    }

    @Override
    public Input name() {
        System.out.println(this.name);
        return this;
    }

    @Override
    public String getDate() {
        return this.date;
    }

    @Override
    public String getHour() {
        return this.hour;
    }

    @Override
    public String getFilename() {
        return this.filename;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Input command(String command) {
        this.command = command;
        return this;
    }

    @Override
    public String getCommand() {
        return this.command;
    }

    @Override
    public String getPath() {

        return this.path;
    }

}