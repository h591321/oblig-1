package oppgave2g;

public class Main {
	public static void main(String[] args) {
		 tid(100000000);
		 tid(1000000000L);
		 tid(10000000000L);
		}

	private static void tid(long n) {
		long startTid=System.currentTimeMillis();
		long k = 0;
		 for (long i = 1; i <= n; i++) {
		k = k + 5;
		 }
		long slutTid= System.currentTimeMillis();
		
		System.out.println(slutTid-startTid);
	}

	
	
	

}
