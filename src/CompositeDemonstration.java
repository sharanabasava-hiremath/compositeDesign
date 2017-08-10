public class CompositeDemonstration {
    public static void main(String[] args) {

        Banker CEO = new Banker("Hiremath","Executive Board", 90000);

        Banker headCashier = new Banker("Sharana","CASH", 75000);

        Banker headClerk = new Banker("Aishwarya","Accounts", 70000);

        Banker clerk1 = new Banker("Rashmi","Accounts", 40000);
        Banker clerk2 = new Banker("Raj","Accounts", 40000);

        Banker cashier1 = new Banker("Sanjay","CASH", 50000);
        Banker cashier2 = new Banker("Sathvik","CASH", 50000);

        CEO.add(headCashier);
        CEO.add(headClerk);

        headCashier.add(cashier1);
        headCashier.add(cashier2);

        headClerk.add(clerk1);
        headClerk.add(clerk2);

        //print all Bankers of the organization
        System.out.println(CEO);

        for (Banker headBanker : CEO.getSubordinates()) {
            System.out.println(headBanker);

            for (Banker Banker : headBanker.getSubordinates()) {
                System.out.println(Banker);
            }
        }
    }
}