
public class Main {

	public static void main(String[] args) {
		System.out.println("this is the main method");
		CustomerChart customerChart = new CustomerChart();
		customerChart.setDao(new CustomerDao());
		customerChart.displayChart();
	}
}
