package singleton;

public class Company {

	private static Company instance = new Company(); 
	// ��ü���� �����ϰ� ��� 
	
    private Company() {
	
	}
    
    public static Company getInstance() {
    	if (instance==null) {
    		instance = new Company(); 
    	}
    	
    	return instance;
    	

    	
    }
    
}
