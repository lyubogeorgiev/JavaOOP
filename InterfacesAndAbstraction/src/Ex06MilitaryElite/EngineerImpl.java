package Ex06MilitaryElite;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class EngineerImpl extends SpecializedSoldierImpl implements Engineer{

    private Set<Repair> repairs;
    public EngineerImpl(String id, String firstName, String lastName, double salary, Corps corps, Repair... repairs) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new HashSet<>(Set.of(repairs));
    }

    public void addRepair(RepairImpl repair) {
        this.repairs.add(repair);
    }

    @Override
    public Collection<Repair> getRepairs() {
        return this.repairs;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(super.toString());

        stringBuilder.append("Repairs:").append(System.lineSeparator());

        for (Repair repair : repairs) {
            stringBuilder.append(repair).append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }
}
