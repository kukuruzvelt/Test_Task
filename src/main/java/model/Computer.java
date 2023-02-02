package model;

import property.Detail;
import property.impl.Processor;
import property.impl.VideoCard;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Computer {
    protected List<Detail> detailList;

    protected String name;

    protected Computer(String name, Processor processor, VideoCard videoCard) {
        this.name = name;
        detailList = new ArrayList<>(){
            {
                add(processor);
                add(videoCard);
            }
        };
    }

    public String getInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        BigDecimal price = BigDecimal.ZERO;
        for (Detail detail : detailList){
            price = price.add(detail.getPrice());
        }
        stringBuilder.append(name).append(" - ").append(price).append("\n\t");
        for (Detail detail : detailList){
            stringBuilder.append(detail.getName()).append(" - ").append(detail.getDescription()).append("\n\t");
        }
        return stringBuilder.toString();
    }
}
