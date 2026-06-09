public class Person {
    public String name, type;
    public int age;
    public boolean first, second;
    public Vaccine V;
    public Person(String n, int a){
        this.name = n; this.age = a; this.type = "General Citizen";
    }
    public Person(String n,int a, String t){
        this.age = a; this.name = n; this.type = t;
    }
    public void pushVaccine(Vaccine v){
        if(type.equalsIgnoreCase("Student")){
            if(this.first == false){
                this.first = true;
                this.V = v;
                System.out.println("1st dose done for "+this.name);
            }
            else if (this. first == true && this.second == false) {
                if(this.V.getName().equalsIgnoreCase(v.getName())){
                    this.second = true;
                    System.out.println("2nd dose done for "+this.name); return;
                }
                System.out.printf("Sorry %s, you can’t take 2 different vaccines\n",this.name); return;
            }
            else {
                System.out.printf("Sorry %s, you already received both doses.\n",this.name); return;
            }
        }
        else{
            if(this.age<25){
                System.out.printf("Sorry %s, Minimum age for taking vaccines is 25 years now.\n",this.name);
            }
            else{
                if(this.first == false){
                    this.first = true;
                    this.V = v;
                    System.out.println("1st dose done for "+this.name);
                }
                else if (this. first == true && this.second == false) {
                    if(this.V.getName().equalsIgnoreCase(v.getName())){
                        this.second = true;
                        System.out.println("2nd dose done for "+this.name); return;
                    }
                    System.out.printf("Sorry %s, you can’t take 2 different vaccines\n",this.name); return;
                }
                else {
                    System.out.printf("Sorry %s, you already received both doses.\n",this.name); return;
                }
            }
        }
    }
    public void pushVaccine(Vaccine v, String dose){
        if(this.first == true && this.second == true){
            System.out.printf("Sorry %s, you already received both doses.\n",this.name); return;
        }
        if(dose.equalsIgnoreCase("2nd Dose")){
            if(this.first == true){
                if(this.V.getName().equalsIgnoreCase(v.getName())){
                    this.second = true;
                    System.out.println("2nd dose done for "+this.name); return;
                }
                System.out.printf("Sorry %s, you can’t take 2 different vaccines\n",this.name); return;
            }
            System.out.printf("Sorry %s, invalid dose request.\n",this.name);
        }
        else{
            if(this.first == false){
                this.first = true;
                this.V = v;
                System.out.println("1st dose done for "+this.name);
            }
            else if (this. first == true && this.second == false) {
                if(this.V.getName().equalsIgnoreCase(v.getName())){
                    this.second = true;
                    System.out.println("2nd dose done for "+this.name); return;
                }
                System.out.printf("Sorry %s, you can’t take 2 different vaccines\n",this.name); return;
            }
            else {
                System.out.printf("Sorry %s, you already received both doses.\n",this.name); return;
            }
        }
    }
    public void showDetail(){
        String S = "Given";
//        String C = String.format("Please comeback after %d days",this.V.getBack());
        if(this.first == true && this.second == false){
            String C = String.format("Please comeback after %d days",this.V.getBack());
            System.out.printf("Name: %s Age: %d Type: %s\nVaccine name: %s\n1st dose: %s\n2nd dose: %s\n",this.name,this.age,this.type,this.V.getName(),S,C);
        }
        else if(this.second == true){
            String C = String.format("Please comeback after %d days",this.V.getBack());
            System.out.printf("Name: %s Age: %d Type: %s\nVaccine name: %s\n1st dose: %s\n2nd dose: %s\n",this.name,this.age,this.type,this.V.getName(),S,S);
        }
        else{
            System.out.printf("Name: %s Age: %d Type: %s\nVaccine name: None taken\n1st dose: Not taken\n2nd dose: Not taken\n",this.name,this.age,this.type);
        }
    }
}
