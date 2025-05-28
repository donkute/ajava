abstract class Plan {
    double rate;

    public abstract void getRate();

    public void calculate(int units) {
        System.out.print("Bill amount for " + units + " units: ");
        System.out.println(rate * units);
    }
}

class CommercialPlan extends Plan {
    public void getRate() {
        rate = 2.60;
    }
}

class DomesticPlan extends Plan {
    public void getRate() {
        rate = 1.50;
    }
}


public class Calculate {
    public static void main(String[] args) {
        Plan p;

        System.out.println("Commercial connection:");
        p = new CommercialPlan();
        p.getRate();
        p.calculate(250);

        System.out.println("\nDomestic connection:");
        p = new DomesticPlan();
        p.getRate();
        p.calculate(150);
    }
}
