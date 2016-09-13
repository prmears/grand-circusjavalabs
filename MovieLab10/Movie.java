package MovieLab10;

public class Movie {

	private String Title;
	private String Category;

	public Movie(String Title, String Category) {
		this.Title = Title;
		this.Category = Category;
	}	
	
	public String getTitle() {
		return Title;
	}

	public String getCategory() {
		return Category;
	}

}