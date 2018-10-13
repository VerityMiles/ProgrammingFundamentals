import java.util.ArrayList;

public class Magazine extends Reading {

	private String magName;
	
	public Magazine(String ID, String appName, double price, String publisher, String genre,  int pages, String magName) {
		super(ID, appName, price, genre, publisher, pages);
		this.magName = magName;
		Reviews = new ArrayList<Comment>();
		downloads = 0;
	}
	
	
	public void showContent(PlayStore store) {
		for(String currentKey : store.Library.keySet()) {
			if (store.Library.get(currentKey) instanceof Magazine) {
				System.out.println(((Magazine)store.Library.get(currentKey)));
			}
		}
	}

}
