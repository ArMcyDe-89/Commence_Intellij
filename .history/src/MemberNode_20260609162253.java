public class MemberNode {

    public Member member;

    public MemberNode next;

    public MemberNode(Member m){
        member = m;
    }

    public void register(Member member){

        if (this.member == null){this.member = member;}
        int ID  = Integer.parseInt(member.ID);

    }
}
