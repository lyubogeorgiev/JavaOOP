package Ex06MilitaryElite;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CommandoImpl extends SpecializedSoldierImpl implements Commando{

    Set<MissionImpl> missions;
    MissionState missionState;

    public CommandoImpl(String id, String firstName, String lastName, double salary, Corps corps, MissionImpl... missions) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new HashSet<>(Set.of(missions));
    }

    public void addMission(MissionImpl mission) {
        this.missions.add(mission);
    }

    @Override
    public Collection<MissionImpl> getMissions() {
        return this.missions;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(super.toString());

        stringBuilder.append("Missions:").append(System.lineSeparator());

        for (MissionImpl mission : this.missions) {
            stringBuilder.append(mission).append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }
}
