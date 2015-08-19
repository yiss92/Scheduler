
public class DayDao {
	private String title;
	private String todo;
	private String location;
	private String described;
	
	public DayDao() {
		super();
	}

	public DayDao(String title, String todo, String location, String described) {
		super();
		this.title = title;
		this.todo = todo;
		this.location = location;
		this.described = described;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescribed() {
		return described;
	}

	public void setDescribed(String described) {
		this.described = described;
	}
	
	//insert 
	//delect
	//update
	

}
