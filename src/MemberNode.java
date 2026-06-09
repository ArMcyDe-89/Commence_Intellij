public class MemberNode {

    public Member member;
    public boolean registered = false;

    public MemberNode next;

    public MemberNode(Member m){
        member = m;
    }
}
