public class Dog extends Animal{
    public String breed;
    public Dog(String name, int age, String color, String breed){
        super(name,age,color); this.breed = breed;
    }
    public void makeSound(){
        System.out.printf("%s color %s is barking\n",super.color,super.name);
    }
    public String info(){
        return super.info()+"Breed: " + this.breed;
    }
}
