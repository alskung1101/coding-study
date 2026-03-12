import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        boolean[][] visited = new boolean[n][n];
        List<int[]> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int h=0;h<n;h++){
                if(board[i][h]==1){
                    list.add(new int[]{i, h});
                }
            }
        }

        for(int j=0; j<list.size(); j++){
            int cx = list.get(j)[0];
            int cy = list.get(j)[1];

            for(int x=-1;x<=1;x++){
                for(int y=-1;y<=1;y++){

                    int nx = cx + x;
                    int ny = cy + y;

                    if(nx >= 0 && ny >= 0 && nx < n && ny < n){
                        if(visited[nx][ny] == true){
                            
                        }else{
                            visited[nx][ny] = true;
                        }
                    }

                }
            }
        }

        for(int i=0;i<n;i++){
            for(int h=0;h<n;h++){
                if(visited[i][h]==false){  
                    answer++;
                }
            }
        }

        return answer;
    }
}