package Day25.Linear_Search;

public class Student {

	public static void main(String[] args) {
		String[] records = { "Tarun:90:100:82:96:95:100", "Tanya:60:70:81:56:95:50", "Tanmay:80:100:66:76:55:20",
				"Anshika:90:100:82:76:55:70", "Varun:90:10:72:96:4:100", "Dingi:9:10:8:6:9:10", "Chinar:90:0:0:96:5:10",
				"Vivek:90:70:82:96:95:100", "Chulbul:40:100:82:96:95:100", "Mako:90:50:82:96:95:60", };
		percentageLS(records);
	}

	public static void percentageLS(String[] r) {
		double[] percentage = new double[r.length];
		String[][] sp = new String[r.length][7];
		for (int i = 0; i < r.length; i++) {
			String temp = r[i];
			sp[i] = temp.split(":");
		}
		// System.out.println(Arrays.deepToString(sp));

		for (int i = 0; i < sp.length; i++) {
			percentage[i] = ((sum(sp[i])) * 100) / 600;
		}
		for (int i = 0; i < sp.length; i++) {
			if (percentage[i] >= 85.0) {
				System.out.println(sp[i][0]);
			}
		}

	}

	public static int sum(String[] sp) {
		int sum = 0;
		for (int i = 1; i < sp.length; i++) {

			sum += Integer.parseInt(sp[i]);

		}
		return sum;
	}

}
