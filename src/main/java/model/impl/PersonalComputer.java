package model.impl;

import model.Computer;
import property.impl.PowerUnit;
import property.impl.Processor;
import property.impl.VideoCard;

public class PersonalComputer extends Computer {
    public PersonalComputer(String name, Processor processor, VideoCard videoCard, PowerUnit powerUnit) {
        super(name, processor, videoCard);
        detailList.add(powerUnit);
    }
}
