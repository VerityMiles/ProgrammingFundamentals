import java.util.*;

abstract public class Content {
	
	protected String ID, appName;
	protected int downloads;
	protected double price;
	public ArrayList<Comment> Reviews; 


	public Content(String ID, String appName, double price) {
		this.ID = ID;
		this.appName = appName;
		Reviews = new ArrayList<Comment>();
		downloads = 0;
		this.price = price;
	}
	
	
	public void addReview(Comment com) {
		Reviews.add(new Comment(com.getU(), com.getText()));
	}

	
	public void showReviews() {
		for (int i = 0 ; i <Reviews.size(); i++) {
			for (int j = 0; j < Reviews.get(i).counter; j++) {
				Reviews.get(i).getReplies().get(j).getThread();
			}
		}
	}
	
	
	public double getPrice() {
		return price;
	}

	
	public String getID() {
		return ID;
	}
	
	
	public String getName() {
		return appName;
	}
	
	
	public int addDownload() {
		downloads += 1;
		return downloads;
	}


	public abstract void showContent(PlayStore store);
	
}
