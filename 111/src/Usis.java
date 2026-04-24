//    public class Usis{
//        public Student [] students = new Student [5];
//        public int totalAdvisee;
//        public Usis(){
//            System.out.println("Usis is ready to use!");
//        }
//        public void login(Student a){
//            if(a.email == null && a.password == null){
//                System.out.println("Email and password need to be set.");
//            }
//            else{
//                a.logged = true;
//                students[this.totalAdvisee] = a;this.totalAdvisee++;
//                System.out.println("Login successful");
//            }
//        }
//        public void advising(Student a){
//            if(a.logged == true){
//                System.out.println("You haven't selected any courses.");
//            }
//            else{
//                System.out.println("Please login to advise courses!");
//            }
//        }
//        public void advising(Student a, String c1, String c2, String c3, String c4){
//            System.out.println("You need special approval to take more than 3 courses.");
//        }
//        public void advising(Student a, String c1, String c2, String c3){
//            a.courses[0] = c1;
//            a.courses[1] = c2;
//            a.courses[2] = c3;
//            System.out.println("Advising successful!");
//        }
//        public void allAdviseeInfo(){
//            System.out.printf("Total Advisee: %d\n",this.totalAdvisee);
//            for(int i =0; i<this.totalAdvisee; i++){
//                Student a = students[i];
//                System.out.printf("Name: %s ID: %d\nDepartment: %s\nAdvised Courses:\n",a.name,a.id,a.dep);
//                for(int j = 0; j<a.courses.length; j++){
//                    if(j == a.courses.length-1){
//                        System.out.printf("%s\n",a.courses[j]);
//                    }
//                    else{
//                        System.out.printf("%s ",a.courses[j]);
//                    }
//                }
//                System.out.println("==============");
//            }
//        }
//    }