package OracleCerner;

public class Cerner {
	    private String Cerner;
	    private String employee;
	    private int year;

	    public Cerner(String Cerner, String employee, int year) {
	        this.Cerner = Cerner;
	        this.employee = employee;
	        this.year = year;
	    }

	    public String getCerner() {
	        return Cerner;
	    }

	    public String getemployee() {
	        return employee;
	    }

	    public int getYear() {
	        return year;
	    }
	}
