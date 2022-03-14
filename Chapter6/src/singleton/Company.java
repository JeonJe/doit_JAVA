package singleton;

public class Company {

	private static Company instance = new Company(); 
	// 전체에서 유일하게 사용 
	
    private Company() {
	
	}
    
    public static Company getInstance() {
    	if (instance==null) {
    		instance = new Company(); 
    	}
    	
    	return instance;
    	

    	
    }
    
}
