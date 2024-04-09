import java.util.*;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Generatoin", 100_000);
        ModelEmployee modelEmployee = new ModelEmployee("FGH", "fgdgd", company);
        ArrayList<ModelEmployee> arrayList = new ArrayList<>();
        Operator operator = new Operator("ghh","dhh",company);
        arrayList.add(modelEmployee);

        for (int i = 1; i <= 180; i++) {//180
            String name = String.valueOf(EnumName.randomEnum());
            String surname = String.valueOf(EnumSurname.randomSurname());
            company.hire(new Operator(name, surname, company));
        }

        for (int i = 1; i <= 80; i++) {//80
            String name = String.valueOf(EnumName.randomEnum());
            String surname = String.valueOf(EnumSurname.randomSurname());
            company.hire(new Manager(name, surname, company));
        }
        for (int i = 1; i <= 10; i++) {//80
            String name = String.valueOf(EnumName.randomEnum());
            String surname = String.valueOf(EnumSurname.randomSurname());
            company.hire(new TopManager(name, surname, company));
        }
        System.out.println(company + "\n");

        System.out.println(company.getIncomeMonth());
        System.out.println(company.getTopSalaryStaff(10));
        System.out.println(company.getLowestSalaryStaff(10));
        System.out.println(company.getArrayList().size());

        Random random = new Random();
        int sizeArray = company.getArrayList().size();
        for (int i = 1; i <= company.getArrayList().size() - 1; i++) {
            Object[] array = company.getArrayList().toArray();
            Object name = array[random.nextInt((sizeArray - 1))];
            company.fire((Employee) name);
            sizeArray = array.length;
        }

        System.out.println(company.getArrayList().size());
//        System.out.println(company.getTopSalaryStaff(15));
//        System.out.println(company.getLowestSalaryStaff(10));


    }
}
