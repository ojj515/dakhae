package myobj;

public class Fbread {
	final static String[] flavorNames = {"팥" , "슈크림", "민트초코"};
	final static int[] defaultPrices = {800, 1000, 1200};
	final static String[] qualityNames = {"잘익음" , "보통", "덜익음"};
	final static int[] qualityPrices = {100, 0, -100};
	
	public final static int KindOfFlavors = flavorNames.length;
	
	public int flavor;
	public int quality;

	public Fbread() {
		flavor = (int)(Math.random() * flavorNames.length);
		quality = (int)(Math.random() * qualityNames.length);
	}
	
	public int getPrice() {
		return defaultPrices[flavor] + qualityPrices[quality];
	}
	
	public static int getTotalPrice(Fbread[] breads) {
		int sum = 0;
		for (int i = 0; i < breads.length; ++i) {
			sum += breads[i].getPrice();
		}
		return sum;
	}
	
}

