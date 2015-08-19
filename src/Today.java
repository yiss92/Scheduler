import java.util.Calendar;

public class Today {
	private String title;
	protected String toDo;
	private String location;
	private String described;
	private String day;
	private Calendar calendar;
	private final int scedulNumber = 24;

	public Today() {
		super();
	}

	public Today(String title, String toDo, String location, String described, String day, Calendar calendar) {
		super();
		this.title = title;
		this.toDo = toDo;
		this.location = location;
		this.described = described;
		this.day = day;
		this.calendar = calendar;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getToDo() {
		return toDo;
	}

	public void setToDo(String toDo) {
		this.toDo = toDo;
	}

	public int getScedulNumber() {
		return scedulNumber;
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

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
}
