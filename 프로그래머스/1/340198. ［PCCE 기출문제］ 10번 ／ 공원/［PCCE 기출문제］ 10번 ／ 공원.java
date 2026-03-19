class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1; 
     
        for (int i = 0; i < mats.length; i++) {
            int size = mats[i];

            for (int h = 0; h <= park.length - size; h++) {
                for (int w = 0; w <= park[0].length - size; w++) {
                    
                    boolean canPlace = true;
                    for (int r = 0; r < size; r++) {
                        for (int c = 0; c < size; c++) {

                            if (!park[h + r][w + c].equals("-1")) {
                                canPlace = false;
                                break; 
                            }
                        }
                        if (!canPlace) break;
                    }

                    if (canPlace) {
                        if (size > answer) {
                            answer = size;
                        }
                    }
                }
            }
        }
        return answer;
    }
}