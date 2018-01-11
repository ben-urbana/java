class Best {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String str = "YOU'RE THE BEST";
		if (args.length>1) {
			int a = Integer.parseInt(args[1]);
			for(int i=0; i<a; i++){
				str += "!";
			}
			for(int i=0; i<n; i++){
				System.out.println(str);
			}
		}
		else {
			for(int i=0; i<n; i++){
				System.out.println(str);
			}
		}

	}
}