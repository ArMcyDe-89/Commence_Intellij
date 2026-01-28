public class Developer extends Employee{
    public String lang;
    public double final_salary;
    public Developer(String name, double baseSalary, int hoursWorked,String lang){
        super(name, baseSalary, hoursWorked); this.lang = lang;
    }
    public void calculateSalary(){
        if(this.lang.equalsIgnoreCase("Java")){
            this.final_salary = getBaseSalary() + 700;
        }
        else{
            this.final_salary = super.getBaseSalary();
        }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.printf("Language: %s%nFinal Salary: $%.1f%n",this.lang,this.final_salary);
    }
}
