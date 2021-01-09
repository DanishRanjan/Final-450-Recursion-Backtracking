import java.util.*;
public class floodFill {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		boolean[][] visited = new boolean[n][m];
		paths(arr, 0, 0, "", visited);
		
	}
	public static void paths(int[][] maze, int row, int col, String ans, boolean[][] visited) {
		if(row<0 || col<0 || row==maze.length || col==maze[0].length || maze[row][col]==1 || visited[row][col]==true) {
			 return; 
		}
		if(row==maze.length-1 && col==maze[0].length-1) {
			System.out.println(ans);
			return;
		}
		
		visited[row][col] = true;
		paths(maze, row - 1, col, ans + "t", visited);
		paths(maze, row, col - 1, ans + "l", visited);
		paths(maze, row + 1, col, ans + "d", visited);
		paths(maze, row, col + 1, ans + "r", visited);
		visited[row][col] = false;	
	}
}

//8
//8
//0 1 0 0 0 0 0 0
//0 1 0 1 1 1 1 0
//0 1 0 1 0 0 0 0
//0 1 0 1 0 1 1 1
//0 0 0 0 0 0 0 0
//0 1 0 1 1 1 1 0
//0 1 0 1 1 1 1 0
//0 1 0 0 0 0 0 0