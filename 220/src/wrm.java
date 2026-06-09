public class wrm {
    patient dummy;
    public wrm(){dummy = new patient();dummy.next=dummy; dummy.prev=dummy;}

    public void registerPatient(int id, String name, int age, String bloodgroup){
        if(dummy.next == dummy){dummy.next = new patient(id, age,name,bloodgroup);
            patient M =dummy.next; M.next = dummy; dummy.prev = M;
        }
        else{
            patient Trav = dummy;
            while(Trav.next!=dummy){
                Trav= Trav.next;
            } Trav.next = new patient(id, age,name,bloodgroup); patient K =Trav.next;
            K.next=dummy; dummy.prev=K;
        }
    }
    public void servePatient(){
        this.dummy.next=this.dummy.next.next;
        this.dummy.next.prev=this.dummy;
    }
    public void cancelAll(){
        dummy.next = dummy; dummy.prev=dummy;
    }
    public String canDoctorGoHome(){
        if(dummy.next == dummy && dummy.prev == dummy){return"He can.";} return "Not yet.";
    }
    public void showAllPatient(){
        patient p =dummy;
        while(p.next != dummy){
            System.out.println(p.id);
        }
    }
    public void reverseTheLine(){

    }

}
