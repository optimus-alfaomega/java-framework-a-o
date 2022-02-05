package src.com.co.ao.output;

public class Standar implements Output {

    private StringBuffer message;
    private String filename;
    private String path;

    public Standar() {

        this.message = new StringBuffer();

    }

    @Override
    public Output log() {
        System.out.println(this.message);
        return this;
    }

    @Override
    public Output log(int exec) {
        return this;
    }

    @Override
    public Output filename(String name) {
        this.filename = name;
        return this;
    }

    @Override
    public Output path(String path) {
        this.path = path;
        return this;
    }

    @Override
    public Output write(String message) {
        this.message.append(message + "\n");
        return this;
    }

}
