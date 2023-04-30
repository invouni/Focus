
import java.util.*;

public class Number_Theory {
//-----|-----:|:-----|-----\\
//List which contains prime numers
	static List<Integer> res = new ArrayList();
//-----|-----:|:-----|-----\\
	//main class
	public static void main(String[] args) {
		//binary Exponentiation
		System.out.println(binary_exponentiation(2, 8));
		//euclids_algo_to_find_gcd
		System.out.println(euclids_algo_to_find_gcd(16, 20));

		//euclids_algo_to_find_lcm
		System.out.println(euclids_algo_to_find_lcm(10, 5));

		print_prime_using_seive();

		//now we have primes so we can just print them
		//
		System.out.println("printing prime numbers -:");
		for (int i = 0; i < 10; i ++) {
			System.out.print(res.get(i) + " ");
		}

	}
//-----|-----:|:-----|-----\\
	//euclids_algo_to_find_lcm
	static long euclids_algo_to_find_lcm(long a, long b) {
		return a * b / euclids_algo_to_find_gcd(a, b);

	}

        //prime numb
	static boolean[]isPrime = new boolean[1000001];
	static void print_prime_using_seive() {

		for (int i = 0; i < 100000; i ++)
			isPrime[i] = true;
		for (int i = 2; i < Math.sqrt(100000); i ++) {
			if (isPrime[i]) {
				for (int j = i * i ; j < 100000; j += i) {
					isPrime[j] = false;
				}
			}
		}

		for (int i = 2; i < 100000; i ++)
			if (isPrime[i]) {

				res.add(i);
			}
	}
	//euclids Algorithm
	static long euclids_algo_to_find_gcd(long a, long b) {
		if (b == 0)
			return a;
		return         euclids_algo_to_find_gcd(b, a % b);
	}

	//binary_exponentiation
	static long binary_exponentiation(long a, long b) {
		if (b == 0)
			return 1;

		long res = binary_exponentiation(a, b / 2);
		if (b % 2 != 0)
			return res * res * a;
		else
			return res * res;
	}

//-----|-----:|:-----|-----\\

}
