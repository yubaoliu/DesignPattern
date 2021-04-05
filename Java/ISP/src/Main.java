
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is ISP main");
		Searcher searcher = new Searcher();
		searcher.searchActress(new AngelBaby());
		
		System.out.println("------------------");
		SearcherB searcherB = new SearcherB();
		searcherB.searchSuperModel(new AngelBaby());

	}

}
