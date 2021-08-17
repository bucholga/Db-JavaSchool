package task2;

import lombok.ToString;

@ToString
public class ClientClasses {
    private final int debt;
    private final int bonus;
    private final String name;
    private final int salary;

    private ClientClasses(ClientDataBuilder cdf)
    {
        this.debt = cdf.debt;
        this.bonus = cdf.bonus;
        this.name = cdf.name;
        this.salary = cdf.salary;
    }

    public static class ClientDataBuilder{
        private int debt;
        private int bonus;
        private String name;
        private int salary;

        public ClientDataBuilder debt(int debt){
            this.debt = debt;
            return this;
        }

        public ClientDataBuilder bonus(int bonus){
            this.bonus = bonus;
            return this;
        }

        public ClientDataBuilder salary(int salary){
            this.salary = salary;
            return this;
        }

        public ClientDataBuilder name(String name){
            this.name = name;
            return this;
        }

        public ClientClasses build(){
            return new ClientClasses(this);
        }
    }

}
