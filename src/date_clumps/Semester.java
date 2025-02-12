package date_clumps;

import java.util.Date;

public class Semester {
	private String label;
	private DateRange range;
	
	public Semester(String label, DateRange range) {
		super();
		this.label = label;
		this.range = range;
	}
	
	public String getLabel() {
		return label;
	}
	
	public Date getStart() {
		return range.getStart();
	}
	
	public Date getEnd() {
		return range.getEnd();
	}
}
