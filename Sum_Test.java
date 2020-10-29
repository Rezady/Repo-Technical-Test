package test_project;

public class Sum_Test {
	
	public static void main (String[] args) {
		int[] input = {2,1,3,5,7,4};
		System.out.println(twoSums(input, 10));
	}
	
	static String twoSums(int[] input, int target) {
		for(int i=0; i<input.length; i++) {
			
			for(int j=0; j<input.length; j++) {
				
				// index yang pernah dicompare, tidak perlu dicompare lagi
				if(i>=j) {
					continue;
					
				}else {
					
					// jika jumlahnya sesuai target, langsung mengeluarkan hasil 
					if(input[i]+input[j]==target) {
						return "hasilnya ialah " + i + " dan " + j;
						
					}
				
				}
				
			}
			
		}
		
		return "tidak ada jawabannya" ;
	}
	
}
