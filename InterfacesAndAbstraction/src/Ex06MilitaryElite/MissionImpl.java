package Ex06MilitaryElite;

public class MissionImpl implements Mission{
    private String codeName;
    private MissionState missionState;

    public MissionImpl(String codeName, MissionState missionState) {
        this.codeName = codeName;
        this.missionState = missionState;
    }

    public void completeMission() {
        this.missionState = MissionState.finished;
    }

    @Override
    public String getCodeName() {
        return this.codeName;
    }

    @Override
    public MissionState getState() {
        return this.missionState;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s",
                this.getCodeName(),
                this.getState());
    }
}
