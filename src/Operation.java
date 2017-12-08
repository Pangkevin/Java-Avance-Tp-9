
public enum Operation {

	PLUS("+") {
		@Override
		public double compute(double a, double n) {
			// TODO Auto-generated method stub
			return a + n;
		}
	}, MOINS("-") {
		@Override
		public double compute(double a, double n) {
			// TODO Auto-generated method stub
			return a - n;
		}
	}, FOIS("*") {
		@Override
		public double compute(double a, double n) {
			// TODO Auto-generated method stub
			return a * n;
		}
	}, DIVISE("/") {
		@Override
		public double compute(double a, double n) {
			// TODO Auto-generated method stub
			return a / n;
		}
	};

	private String signe = "";

	Operation(String signe) {

		this.signe = signe;
	}

	@Override
	public String toString() {

		return this.signe;
	}

	public  abstract double compute(double a, double n);
}
