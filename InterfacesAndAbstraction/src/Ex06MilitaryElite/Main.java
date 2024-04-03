package Ex06MilitaryElite;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, PrivateImpl> privates = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens =  input.split("\\s+");

            String soldierType = tokens[0];
            String id = tokens[1];
            String firstName = tokens[2];
            String lastName = tokens[3];
            double salary;

            switch (soldierType) {
                case "Private":
                    salary = Double.parseDouble(tokens[4]);
                    //place to put Try-catch eventually
                    PrivateImpl priv = new PrivateImpl(id, firstName, lastName, salary);
                    privates.put(id, priv);
                    System.out.println(priv);
                    break;
                case "LieutenantGeneral":
                    salary = Double.parseDouble(tokens[4]);
                    PrivateImpl[] privsToInsert = new PrivateImpl[(tokens.length - 5)];

                    if (tokens.length > 6) {

                        for (int i = 5; i < tokens.length; i++) {
                            privsToInsert[i - 5] = privates.get(tokens[i]);
                        }
                    }
                    LieutenantGeneralImpl lieutenantGeneral =
                            new LieutenantGeneralImpl(id, firstName, lastName, salary, privsToInsert);

                    System.out.println(lieutenantGeneral);
                    break;
                case "Engineer":
                    salary = Double.parseDouble(tokens[4]);
                    Corps corps = Corps.valueOf(tokens[5]);
                    RepairImpl[] repairs = new RepairImpl[(tokens.length - 6) / 2];

                    if (tokens.length > 7) {
                        int counter = 0;

                        for (int i = 6; i < tokens.length; i += 2) {
                            String partName = tokens[i];
                            int hours = Integer.parseInt(tokens[i + 1]);

                            //???
                            repairs[counter++] = new RepairImpl(partName, hours);
                        }
                    }

                    EngineerImpl engineer = new EngineerImpl(id, firstName, lastName, salary, corps, repairs);

                    System.out.println(engineer);
                    break;
                case "Commando":
                    salary = Double.parseDouble(tokens[4]);
                    Corps corps1 = Corps.valueOf(tokens[5]);
                    MissionImpl[] missions = new MissionImpl[(tokens.length - 6) / 2];

                    if (tokens.length > 7) {
                        int counter = 0;

                        for (int i = 6; i < tokens.length; i += 2) {
                            String codeName = tokens[i];
                            MissionState missionState = MissionState.valueOf(tokens[i + 1]);
                            missions[counter++] = new MissionImpl(codeName, missionState);
                        }
                    }

                    CommandoImpl commando = new CommandoImpl(id, firstName, lastName, salary, corps1, missions);

                    System.out.println(commando);
                    break;
                case "Spy":
                    String codeNumber = tokens[4];

                    SpyImpl spy = new SpyImpl(id, firstName, lastName, codeNumber);

                    System.out.println(spy);
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
