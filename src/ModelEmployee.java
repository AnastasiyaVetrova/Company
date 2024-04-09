public class ModelEmployee implements Employee {
    private String name;
    private String surname;
    int salary;
    Company company;

    public void setCompany(Company company) {
        this.company = company;
    }

    public ModelEmployee(String name, String surname, Company company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
        this.salary=company.getMinSalary();
            }

    @Override
    public int getMonthSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return salary + "\n";
//                "name='" + name + ' ' +
//                        ", surname='" + surname + ' ' +
//                        ", salary=" + salary + " ";
    }
}
