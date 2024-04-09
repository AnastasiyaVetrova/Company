import java.util.*;

public class Company {
    private final static int MROT = 16242;
    private final String nameCompany;
    private int minSalary;
    private int incomeMonth;
    private int incomeEmployee;
    private List<Employee> arrayList;

    public Company(String nameCompany) {
        this.nameCompany = nameCompany;
        this.minSalary = MROT;
        this.arrayList = new ArrayList<>();
        this.incomeMonth = getIncomeMonth();
    }

    public Company(String nameCompany, int minSal) {
        this(nameCompany);
        if (minSal < MROT) {
            this.minSalary = MROT;
        } else {
            this.minSalary = minSal;
        }
    }

    public void hire(Employee employee) {
        employee.setCompany(this);
        arrayList.add(employee);
    }

    public void hireAll(List<Employee> arrayList) {
        for (Employee e : arrayList) {
            hire(e);
        }
    }

    public List<Employee> sortCollection(int count, Comparator cmp) {
        arrayList.sort(cmp);
        return arrayList.subList(0, count);
    }

    public List<Employee> getTopSalaryStaff(int count) {
        return sortCollection(count, Comparator.naturalOrder());
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        return sortCollection(count, Comparator.reverseOrder());
    }

    public void fire(Employee employee) {
        employee.setCompany(null);
        arrayList.remove(employee);

    }

    public int randomIncome() {
        Random random = new Random();
        incomeEmployee = random.nextInt(115_000, 140_000);
        incomeMonth = getIncomeMonth() + incomeEmployee;
        return incomeEmployee;
    }

    @Override
    public String toString() {
        String all = getNameCompany().concat("\n");
        for (Employee entry : arrayList) {
            all = all.concat(entry.toString());
        }
        return all + "\nОбщий доход: " + getIncomeMonth();
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public int getIncomeMonth() {
        return incomeMonth;
    }

    public List<Employee> getArrayList() {
        return new ArrayList<>(arrayList);
    }
}

