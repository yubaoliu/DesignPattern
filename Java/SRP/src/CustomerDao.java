import java.util.ArrayList;
import java.util.List;

public class CustomerDao {

	protected List<Customer> findCustomers() {
		List<Customer> ret = new ArrayList<Customer>();
		ret.add(new Customer("zhangsan", 30));
		ret.add(new Customer("wukong", 50));
		return ret;
	}
}
