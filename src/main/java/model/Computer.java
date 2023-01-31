package model;

import property.impl.Processor;
import property.impl.VideoCard;

public abstract class Computer {
    Processor processor;
    VideoCard videoCard;

    public abstract String getInfo();
}
