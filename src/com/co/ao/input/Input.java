package src.com.co.ao.input;

public interface Input {

    public Input name();

    public Input name(String name);

    public Input description();

    public Input description(String description);

    public Input path();

    public Input path(String path);

    public Input filename();

    public Input filename(String filename);

    public abstract Input function(Object[] args) throws Exception;

    public Input hour();

    public Input hour(String hour);

    public Input date();

    public Input date(String date);

    public Input command(String command);

    public String getDate();

    public String getHour();

    public String getFilename();

    public String getPath();

    public String getName();

    public String getCommand();
}
