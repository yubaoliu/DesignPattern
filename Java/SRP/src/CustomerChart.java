
public class CustomerChart {
	CustomerDao dao;
	public void setDao(CustomerDao dao) {
		this.dao= dao;
	}
	
	public void displayChart() {
		for (Customer customer : dao.findCustomers()) {
			System.out.println("customer: " + customer.name);
		}
	}

}
