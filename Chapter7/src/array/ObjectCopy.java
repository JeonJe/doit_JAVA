package array;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("������1","���ٻ�1");
		bookArray1[1] = new Book("������2","���ٻ�2");
		bookArray1[2] = new Book("������3","���ٻ�3");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		
		
//		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		

		bookArray1[0].setBookName("��ȭ");
		bookArray1[0].setAuthor("ȫ�浿");
		
		
		for(int i = 0; i < bookArray2.length; i++) {
			
			bookArray2[i].showBookInfo();
		}
		
		

	}

}
