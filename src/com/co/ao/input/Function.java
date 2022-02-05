package src.com.co.ao.input;

import javax.sound.sampled.SourceDataLine;

public abstract class Function extends Standar {

    public Function() {
        super();
    }

    @Override
    public abstract Input function(Object[] args) throws Exception;

}
