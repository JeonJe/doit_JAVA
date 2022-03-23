package exception;

public class IDFormatTest {

	private String UserID;

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) throws IDFormatException{
		if (userID ==  null) {
			throw new IDFormatException("아이디는  null 일 수 없습니다.");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하입니다");
		}
		this.UserID = userID;
	}
		
	public static void main(String[] args) {
		IDFormatTest idTest = new IDFormatTest();
		
		String userID = "12342222";
		
		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
		
}


