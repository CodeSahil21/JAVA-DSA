import java.util.Arrays;

public class mazeAllpath {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        Allpathsprint("",board,0,0,path, 1);
    }
    static void Allpaths(String p, boolean[][] maze , int r , int c){
        if(r == maze.length-1 && c == maze[0].length-1){ // here we will consider corner most elements
            // ie row at last index and col at 0 index
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){ //so that it doesnot make more recursive calls
           return;


        }
        // i am considering this block in my path
        maze[r][c] = false;
        if(r < maze.length-1){// row should be less  than last coordinate ie 3x3 matrix it cannot exceed index 2
            Allpaths(p + 'D', maze,r+1, c  );// here we incrementing in recursion hence r+1
        }
        if(c < maze[0].length-1){// similar for column but it will not exceed 0th index
            Allpaths(p + 'R',maze,r,c+1);
        }
        if(r > 0){
            Allpaths(p + 'U',maze,r-1,c);
        }
        if(c > 0){
            Allpaths(p + 'L',maze,r,c-1);
        }
        /*this step at line 22 and 39 is backtracking make a change and reverse the change is thought process of backtracking
        this line where function will be over
        so before the function gets removed,also remove changes that were made by that function
         */
        maze[r][c] = true;
    }
    static void Allpathsprint(String p, boolean[][] maze , int r , int c,int[][] path, int step){
        if(r == maze.length-1 && c == maze[0].length-1){ // here we will consider corner most elements
            // ie row at last index and col at 0 index
            path[r][c] = step;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){ //so that it doesnot make more recursive calls
            return;


        }
        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        if(r < maze.length-1){// row should be less  than last coordinate ie 3x3 matrix it cannot exceed index 2
            Allpathsprint(p + 'D', maze,r+1, c ,path, step+1 );// here we incrementing in recursion hence r+1
        }
        if(c < maze[0].length-1){// similar for column but it will not exceed 0th index
            Allpathsprint(p + 'R',maze,r,c+1,path, step+1);
        }
        if(r > 0){
            Allpathsprint(p + 'U',maze,r-1,c,path, step+1);
        }
        if(c > 0){
            Allpathsprint(p + 'L',maze,r,c-1,path, step+1);
        }
        /*this step at line 22 and 39 is backtracking make a change and reverse the change is thought process of backtracking
        this line where function will be over
        so before the function gets removed,also remove changes that were made by that function
         */
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
