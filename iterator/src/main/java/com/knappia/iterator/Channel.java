package com.knappia.iterator;

import lombok.Data;

@Data
public class Channel {
    private Float frequency;
    private String name;

    public Channel(Float frequency, String name) {
        this.frequency = frequency;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "frequency=" + frequency +
                ", name='" + name + '\'' +
                '}';
    }
}
