package gradebook;

public class Gradebook {
		public static void main(String[] args) {
			double[][] grades = 
				{{5, 15, 10, 5, 4, 8, 8.75, 8, 10, 10, 10, 10, 10, 10, 10}, // quiz 
				{70}, // discussion
				{249.9}, // zybook activities
				{140, 4}, // programming exercises
				{75, 90, 82.5}, // unit tests
				{100}}; // final
			
			sumAllGrades(grades);
			
			if (sumAllGrades(grades) >= 90) {
				System.out.println(sumAllGrades(grades) + " - A");
			} else if (sumAllGrades(grades) >= 80) {
				System.out.println(sumAllGrades(grades) + " - B");
			} else {
				System.out.println(sumAllGrades(grades) + " - grade below B; you will not get credit for this course");
			}
			
		}
			
		public static double sumAllGrades(double[][] array) {
			double sum = 0;
					
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					sum += array[i][j];	
				} 		
			}
			sum = (Math.round(sum) * 100) / 1000;
			return sum;
		}
		
			public static double averageAllGrades(double[][] array) {
				double sum = 0;
				double average = sum / array.length;
				
				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[i].length; j++) {
						sum += array[i][j];	
					} 
					average = sum / array.length;
					average += average;
				}
				return average;
			}		
}
