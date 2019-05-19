package com.knappia.iterator;

import java.util.ArrayList;
import java.util.List;

public class CentralTelevesion implements RegionTelevision {
    private List<Channel> channels;

    public CentralTelevesion() {
        channels = new ArrayList<>();
        channels.add(new Channel(12015f, "NTV"));
        channels.add(new Channel(11014f, "RenTV"));
    }

    @Override
    public List<Channel> getChannels() {
        return channels;
    }
}
