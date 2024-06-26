package Ex06MilitaryElite;

public class SoldierImpl implements Soldier{
    private String id;
    private String firstName;
    private String lastName;

    public SoldierImpl(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
