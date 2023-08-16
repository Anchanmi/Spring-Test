package survey;

import java.util.Collections;
import java.util.List;

public class Question {
	
	private String title;
	private List<String> options;
	private boolean choice;
	
	public Question(String title, List<String> options) {
		this.title = title;
		this.options = options;
	}
	
	public Question(String title) {
		this(title, Collections.<String>emptyList());
	}
	
	public String getTitle() {
		return title;
	}
	
	public List<String> getOptions(){
		return options;
	}
	
	public boolean isChoice() {
		choice = options != null && !options.isEmpty();
		return choice;
	}
	
	public Boolean getChoice() {
		return choice;
	}
}
