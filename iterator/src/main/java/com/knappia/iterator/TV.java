package com.knappia.iterator;

import java.util.*;

public class TV implements Iterator<Channel> {
    private List<Channel> channels;
    private RegionTelevision regionTelevision;
    private int cursor;

    public TV(RegionTelevision regionTelevision) {
        this.regionTelevision = regionTelevision;
        this.channels = regionTelevision.getChannels();
        cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return cursor != channels.size();
    }

    @Override
    public Channel next() {
        int i = cursor;
        if (i >= channels.size())
            throw new NoSuchElementException();
        cursor = i + 1;
        return channels.get(i);
    }
}
