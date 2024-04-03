package Ex06MilitaryElite;

import java.util.HashSet;
import java.util.Set;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral{
    private Set<PrivateImpl> privates;
    public LieutenantGeneralImpl(String id, String firstName, String lastName, double salary, PrivateImpl... privs) {
        super(id, firstName, lastName, salary);
        this.privates = new HashSet<>(Set.of(privs));
    }

    public void addPrivate(PrivateImpl priv) {
        this.privates.add(priv);
    }

    @Override
    public Set<PrivateImpl> getPrivate() {
        return this.privates;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("Name: %s %s Id: %s Salary: %.2f",
                this.getFirstName(),
                this.getLastName(),
                this.getId(),
                this.getSalary()));

        stringBuilder.append(System.lineSeparator());

        stringBuilder.append("Privates:").append(System.lineSeparator());

        for (Private priv : this.privates) {
            stringBuilder.append(priv).append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }
}
