import java.util.ArrayList;

public class mazecount {
    public static void main(String[] args) {
     //   System.out.println(count(3,3));
      //  path("",3,3);
       // System.out.println(pathret("",3,3));
      //  System.out.println(pathretdiagonal("",3,3));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathrestrictions("",board,0,0);
    }

    static int count(int r, int c){
        if(r == 1 || c == 1){// with is condition we can count the paths since whenever row or col == 1
            // means we have found the possible path ie one path
            return 1;
        }

        int left = count(r-1,c);// since every time object move towards target in right and down movement
        // it either reduces row or col
        int right = count(r,c-1);
        return left + right;

    }

     static void path(String p, int r , int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            path(p + 'D', r-1, c  );
        }
        if(c>1){
            path(p + 'R',r,c-1);
        }
     }

    static ArrayList<String> pathret(String p, int r , int c){
        if(r == 1 && c == 1){
          ArrayList<String> list = new ArrayList<>();
          list.add(p);
          return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(pathret(p + 'D', r-1, c  ));
        }
        if(c>1){
            list.addAll(pathret(p + 'R',r,c-1));
        }
        return  list;
    }
    static ArrayList<String> pathretdiagonal(String p, int r , int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r > 1 && c > 1){
            list.addAll(pathretdiagonal(p + 'D', r-1, c-1  ));
        }
        if(r > 1){
            list.addAll(pathretdiagonal(p + 'V', r-1, c  ));
        }
        if(c>1){
            list.addAll(pathretdiagonal(p + 'H',r,c-1));
        }
        return  list;
    }
    static void pathrestrictions(String p, boolean[][] maze ,int r , int c){
        if(r == maze.length-1 && c == maze[0].length-1){ // here we will consider corner most elements
            // ie row at last index and col at 0 index
            System.out.println(p);
            return;
             }
            if(!maze[r][c]){
                return;

        }
        if(r < maze.length-1){// row should be less  than last coordinate ie 3x3 matrix it cannot exceed index 2
            pathrestrictions(p + 'D', maze,r+1, c  );// here we incrementing in recursion hence r+1
        }
        if(c < maze[0].length-1){// similar for column but it will not exceed 0th index
            pathrestrictions(p + 'R',maze,r,c+1);
        }
    }
}
