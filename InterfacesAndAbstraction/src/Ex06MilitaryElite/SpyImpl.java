package Ex06MilitaryElite;

public class SpyImpl extends SoldierImpl implements Spy{
    String codeNumber;
    public SpyImpl(String id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String getCodeNumber() {
        return codeNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s Code Number: %s",
                this.getFirstName(),
                this.getLastName(),
                this.getId(),
                this.getCodeNumber());
    }
}
