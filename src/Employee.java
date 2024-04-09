public interface Employee extends Comparable<Employee> {
    int getMonthSalary();
    String getName();
    String getSurname();
   default void setCompany(Company company){};
    @Override
    default int compareTo(Employee o1) {

        int res=Integer.compare(getMonthSalary(),o1.getMonthSalary());
        if (res==0){
            res=getSurname().compareTo(o1.getSurname());
            if(res==0){
                getName().compareTo(o1.getName());
            }
        }return res;
    }
}

