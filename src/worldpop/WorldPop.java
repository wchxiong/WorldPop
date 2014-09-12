

package worldpop;



public class WorldPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] numbers = 
			{
				{1750, 1800, 1850, 1900, 1950, 2000, 2050},
				{106, 107, 111, 133, 221, 767, 1766},
				{502, 635, 809, 947, 1402, 3634, 5268},
				{2, 2, 2, 6, 13, 30, 46},
				{163, 203, 276, 408, 547, 729, 628},
				{2, 7, 26, 82, 172, 307, 392},
				{16, 24, 38, 74, 167, 511, 809}
			};
		
		String[] countries = 
			{
				"Year",
				"Africa",
				"Asia",
				"Aus",
				"Europe",
				"N Amer",
				"S Amer",		
			};
		
		for (int r = 0; r < numbers.length; r++)
		{
			System.out.print(countries[r] + "\t\t");
			for (int c = 0; c < numbers[r].length; c++)
			{
				System.out.print(numbers[r][c] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
