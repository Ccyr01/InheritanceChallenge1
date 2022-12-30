public class Main {
    public static void main(String[] args) {

        HourlyEmployee hE = new HourlyEmployee("Eth", "02/13/1992", "08/01/2020", 12.50);
        System.out.println(hE);
        hE.getDoublePay();

        SalariedEmployee Joe = new SalariedEmployee("Joe","01/01/2001","01/02/2020",40000);
        System.out.println(Joe);
        System.out.println("Joe's paycheck = $"+Joe.collectPay());
        Joe.retire();
        System.out.println("Joe's pension check = $"+Joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary","05/05/1964","03/03/2021",15);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $"+mary.collectPay());
        System.out.println("Mary's holiday pay = $"+mary.getDoublePay());


    }
}