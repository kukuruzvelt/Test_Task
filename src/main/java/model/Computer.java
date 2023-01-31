package model;

import property.impl.Processor;
import property.impl.VideoCard;

public abstract class Computer {
    protected Processor processor;
    protected VideoCard videoCard;

    public abstract String getInfo();
}
