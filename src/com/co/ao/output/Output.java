package src.com.co.ao.output;

public interface Output {

    public Output log();

    public Output log(int exec);

    public Output filename(String name);

    public Output path(String path);

    public Output write(String message);

}
