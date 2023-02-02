package model.impl;

import model.Computer;
import property.impl.Battery;
import property.impl.Processor;
import property.impl.Screen;
import property.impl.VideoCard;

public class Laptop extends Computer {
    public Laptop(String name, Processor processor, VideoCard videoCard, Battery battery, Screen screen) {
        super(name, processor, videoCard);
        detailList.add(battery);
        detailList.add(screen);
    }
}
