package task2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Object> paramsClientMap = new HashMap<>();
        paramsClientMap.put("debt", 12);
        paramsClientMap.put("bonus", 14);
        paramsClientMap.put("name", "Vasya");
        paramsClientMap.put("salary", 100);
        Client client = new Client(paramsClientMap);
        System.out.println(client);
        HashMap<String, Object> paramsNewClientMap = new HashMap<>();
        paramsNewClientMap.put("bonus", 17);
        paramsNewClientMap.put("name", "Petya");
        paramsNewClientMap.put("salary", 1000);
        Client newClient = new Client(paramsNewClientMap);
        System.out.println(newClient);
        ClientUpgrade upgCl = new ClientUpgrade(paramsClientMap);
        System.out.println(upgCl);

        ClientClasses clientClasses = new ClientClasses.ClientDataFiller()
                .debt(100)
                .bonus(12)
                .name("Sasha")
                .salary(800)
                .build();
        System.out.println(clientClasses);
    }
}
