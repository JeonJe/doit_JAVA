package collection;

public class Member {
	private int memeberId;
	private String memberName;
	
	
	public Member(int memeberId, String memberName) {
		super();
		this.memeberId = memeberId;
		this.memberName = memberName;
	}

	public int getMemeberId() {
		return memeberId;
	}
	public void setMemeberId(int memeberId) {
		this.memeberId = memeberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		
		return memberName + "회원님의 아이디는" + memeberId + "입니다";
	}
	
}
