package com.knappia.facade;

import java.util.ArrayList;
import java.util.List;

public class ITCompanyFacade {
    private List<ITUnit> team;

    public ITCompanyFacade() {
        team = new ArrayList<>();
        team.add(new DeveleoperUnit());
        team.add(new TestingUnit());
        team.add(new AnalystUnit());
    }

    public void createOneDayApplication(){
        team.forEach(itUnit -> itUnit.action(ITUnit.Action.WAKE_UP, ITUnit.Action.GO_TO_WORK));
        team.forEach(itUnit -> itUnit.action(ITUnit.Action.WORK, ITUnit.Action.LUNCH));
        team.forEach(itUnit -> itUnit.action(ITUnit.Action.GO_TO_HOME, ITUnit.Action.GO_TO_SLEEP));
    }
}
