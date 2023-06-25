public class Test {
    public static void main(String[] args) {
        Employee impiegato1 = new Employee("Marco", "Rossi", "Via Roma");
        Employee impiegato2 = new Employee("Luca", "Bianchi", "Via Polaretto");

        Badge badge1 = new Badge(impiegato1);
        Badge badge2 = new Badge(impiegato2);

        badge1.showBadgeDetails();
        badge2.showBadgeDetails();


    }
}
