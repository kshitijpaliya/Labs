
class Result {

	static int sub[][] = new int[100][4];
	static int total[] = new int[100];
	static int size = 0;

	Result(int roll, int sub1, int sub2, int sub3) {

		sub[size][0] = roll;
		sub[size][1] = sub1;
		sub[size][2] = sub2;
		sub[size][3] = sub3;
		total[size] = sub1 + sub2 + sub3;
		size++;
	}

	static void subhigh() {

		int high = sub[0][1];
		int i = 0;
		for (i = 0; i < size; i++) {
			if (high < sub[i][1]) {
				high = sub[i][1];
			}
		}
		for (i = 0; i < size; i++) {
			if (sub[i][1] == high)
				break;
		}
		System.out.println("Roll no " + sub[i][0] + " got highest marks in sub1: " + high);

		high = sub[0][2];
		for (i = 1; i < size; i++) {
			if (high < sub[i][2]) {
				high = sub[i][2];
			}
		}
		for (i = 0; i < size; i++) {
			if (sub[i][2] == high)
				break;
		}
		System.out.println("Roll no " + sub[i][0] + " got highest marks in sub2: " + high);

		high = sub[0][3];
		for (i = 1; i < size; i++) {
			if (high < sub[i][3]) {
				high = sub[i][3];
			}
		}
		for (i = 0; i < size; i++) {
			if (sub[i][3] == high)
				break;
		}
		System.out.println("Roll no " + sub[i][0] + " got highest marks in sub3: " + high);
	}

	static void totalhigh() {
		int high = total[0];
		int i = 0;
		for (i = 1; i < size; i++) {
			if (high < total[i]) {
				high = total[i];
			}
		}
		for (i = 0; i < size; i++) {
			if (total[i] == high)
				break;
		}
		System.out.println("Roll no " + sub[i][0] + " got highest marks overall: " + high);
	}

	static void odd(Result A1, Result A2, Result A3) {
		int odd=0;
		//for (int j = 1; j <= 3; j++) {
			for (int[] n : sub) {
				for (int i : n) {
					if (i % 2 != 0) {
						odd++;
						System.out.println(i);
						
					}
				}
				
			}
			System.out.println(odd-1);
		//}
	}


	static void prime_no() {

		int prime = 0;
		for (int[] n : sub) {
			for (int i : n) {
				for (int j = 2; j < i / 2; j++) {
						if ((i % j) == 0) {
							prime = 1;
							break;
						}
						if(prime==0)
						System.out.println(i);}
						}
				
				}
			}

	}

// static void palindrome(){
// 	int n;
	
// 	int sum=0, rem;

// 	for(int n: sub){
// 		int temp=n;
// 	while(n>0){
// 	rem=n%10;
// 	sum=(sum*10)+rem;
// 	n=n/10;
// }
// 	if(temp==sum)
// 	System.out.println("Pallindrome");
// 	else
// 	System.out.println("Not Pallindrome");
// 	}
// }

class Eval {
	public static void main(String args[]) {

		Result A1 = new Result(1, 45, 46, 47);
		Result A2 = new Result(2, 40, 48, 48);
		Result A3 = new Result(4, 44, 40, 49);

		Result.subhigh();
		Result.totalhigh();
		Result.odd(A1,A2,A3);
		Result.prime_no();
		// Result.palindrome();
	}
}
