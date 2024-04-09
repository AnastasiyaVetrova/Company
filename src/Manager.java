public class Manager extends ModelEmployee implements Employee {
    private final static double BASE_EXTRAPAY_MANAGER = 1.1;
    private int sales;

    public Manager(String name, String surname, Company company) {
        super(name, surname, company);
        this.sales = company.randomIncome();
        salary = (int) (salary * BASE_EXTRAPAY_MANAGER + 0.05 * sales);
    }
    @Override
    public int getMonthSalary() {
        return super.getMonthSalary();
    }
}
