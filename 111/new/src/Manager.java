public class Manager extends Employee{
    public double bonus;
    public double final_salary;
    public Manager(String name, double baseSalary, int hoursWorked, double bonus){
        super(name,baseSalary,hoursWorked); this.bonus = bonus; this.final_salary = baseSalary;
    }
    public void calculateSalary(){
        if(super.getHoursWorked()>40){
            this.final_salary = super.getBaseSalary()+super.getBaseSalary()*(this.bonus/100.0);
        }
        else{
            System.out.println("Increment denied.");
        }
    }
    public void requestIncrement(int inc){
        if(getHoursWorked()>100){
            super.setBaseSalary(getBaseSalary()+inc);
            System.out.printf("$%d Increment approved.\n", inc);
        }
        else if(getHoursWorked()<100 && getHoursWorked()>80){
            super.setBaseSalary(getBaseSalary()+(inc/2));
            System.out.printf("$%d Increment approved.\n", inc/2);
        }
        else{
            System.out.println("Increment denied.");
        }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.printf("Bonus: %.1f%%\nFinal Salary: $%.1f\n",this.bonus,this.final_salary);
    }
}
