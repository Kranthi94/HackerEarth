
public class TenPinBowling {

    private static int[] scores1 = new int[]{
            4,3,10,6,0,8,0,5,3,9,1,8,0,2,8,2,6,9,1,1
    };

    private static int[] scores = new int[]{
            8,1,4,1,7,0,3,0,9,0,2
    };

    private static int points = 0;

    private static boolean isLastFrameStrike = false;

    private static boolean isIsLastFrameSpare = false;

    private static boolean isFrameFinished = false;

    public static void main(String[] args){

        int j = 0;

        for(int i = 0; i < scores.length; i++){

            int c1 = scores[i];

            if(c1 == 10){

                isLastFrameStrike = true;

                isFrameFinished = true;

            }else {

                isFrameFinished = false;

                j++;

                if(isIsLastFrameSpare){

                    if(j == 1){
                        points  = points + 10 + scores[i];
                    }

                    isIsLastFrameSpare = false;

                }else {

                    if(j == 2){

                        j = 0;

                        if(scores[i-1] + scores[i] == 10){

                            isIsLastFrameSpare = true;

                        }else {

                            int framePoints = scores[i-1] + scores[i];

                            int extraPoints = 0;

                            if(isLastFrameStrike){
                                extraPoints = 10 + framePoints;
                            }

                            if(isIsLastFrameSpare){
                                extraPoints = 10 + scores[i-1];
                            }

                            points = points + extraPoints + framePoints;



                            isLastFrameStrike = false;

                            isIsLastFrameSpare = false;
                        }

                        isFrameFinished = true;
                    }
                }
            }

            System.out.println(points);
        }
    }
}
