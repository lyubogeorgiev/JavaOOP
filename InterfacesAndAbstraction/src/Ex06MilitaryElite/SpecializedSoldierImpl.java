package Ex06MilitaryElite;

public class SpecializedSoldierImpl extends PrivateImpl implements SpecializedSoldier{
    private Corps corps;
    public SpecializedSoldierImpl(String id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary);
        this.corps = corps;
    }

    @Override
    public Corps getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(super.toString()).append(" ");
        stringBuilder.append("Corps: ").append(corps.toString()).append(System.lineSeparator());

        return stringBuilder.toString();
    }
}
