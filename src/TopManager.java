public class TopManager extends ModelEmployee implements Employee {
    private final static double BASE_EXTRAPAY_TOPMANAGER = 1.2;

    public TopManager(String name, String surname, Company company) {
        super(name, surname, company);
        salary = (int) (salary * BASE_EXTRAPAY_TOPMANAGER);
        if (company.getIncomeMonth() > 10_000_000) {
            salary = (int) (salary * 1.15);
        }
    }

    @Override
    public int getMonthSalary() {
        return super.getMonthSalary();
    }
}
