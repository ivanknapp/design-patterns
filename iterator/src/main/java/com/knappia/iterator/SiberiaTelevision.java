package com.knappia.iterator;

import java.util.ArrayList;
import java.util.List;

public class SiberiaTelevision implements RegionTelevision {

    private List<Channel> channels;

    public SiberiaTelevision() {
        channels = new ArrayList<>();
        channels.add(new Channel(11973f, "MTV"));
        channels.add(new Channel(3960f, "CNN"));
        channels.add(new Channel(39312f, "Siberia Music"));
    }

    @Override
    public List<Channel> getChannels() {
        return channels;
    }
}
