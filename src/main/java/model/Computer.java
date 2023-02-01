package model;

import property.impl.Processor;
import property.impl.VideoCard;

public abstract class Computer {
    protected String name;
    protected Processor processor;
    protected VideoCard videoCard;

    public abstract String getInfo();
}
