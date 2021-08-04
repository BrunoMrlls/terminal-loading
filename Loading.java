public class Loading {
	public static void main(String[] args) throws InterruptedException {
		String middle = "[%s] - Processando alguma coisa...";
		int indexes = 3;
		String symbol = "*";

		for(;;)
		for (int i=0; i<indexes; i++) {
			String dots = "";
			while (dots.length() < indexes) {dots+=" ";}

			dots = dots.substring(0, i)+symbol+dots.substring(i+1);
			showMessage(String.format(middle, dots));
			Thread.sleep(500);
		}
	}
	
	public static void showMessage(String message) {
		System.out.print(message+"\r");
		System.out.flush();
	}
}
