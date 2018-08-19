package ass1;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class period {
	private String customer;
	private LocalDate start_date1;
	private LocalDate end_date;
	private int days;
	
	public period(String customer,LocalDate start_date,int days) {
		this.start_date1 = start_date;
		this.days = days;
		this.end_date = start_date1.plus(days, ChronoUnit.DAYS);
		this.customer = customer;
	}
	/*
	LocalDate date = LocalDate.of(2017, 1, 5);          // 2017-01-05

	LocalDate date1 = date.withYear(2016);              // change to  2016-01-05
	LocalDate date2 = date.withMonth(2);                // change to 2017-02-05
	LocalDate date3 = date.withDayOfMonth(1);           // change to  2017-01-01

	LocalDate date4 = date.plusYears(1);                // add years 2018-01-05
	LocalDate date5 = date.minusMonths(2);              // minus years 2016-11-05
	LocalDate date6 = date.plus(5, ChronoUnit.DAYS);    // add days 2017-01-10
	/**
	 * @return the days
	 */
	public int getDays() {
		return days;
	}
	/**
	 * @param days the days to set
	 */
	public void setDays(int days) {
		this.days = days;
	}

	/**
	 * @return the customer
	 */
	public String getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public LocalDate getenddate() {
		return end_date;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public LocalDate getstartdate() {
		return start_date1;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + days;
		result = prime * result + ((end_date == null) ? 0 : end_date.hashCode());
		result = prime * result + ((start_date1 == null) ? 0 : start_date1.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		period other = (period) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (days != other.days)
			return false;
		if (end_date == null) {
			if (other.end_date != null)
				return false;
		} else if (!end_date.equals(other.end_date))
			return false;
		if (start_date1 == null) {
			if (other.start_date1 != null)
				return false;
		} else if (!start_date1.equals(other.start_date1))
			return false;
		return true;
	}
	
}
