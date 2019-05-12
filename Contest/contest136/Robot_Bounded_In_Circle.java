package contest136;

/**
 * @authoor linzerong
 * @create 2019-05-12 10:30
 */
public class Robot_Bounded_In_Circle {
    public boolean isRobotBounded(String instructions) {
        instructions += instructions + instructions + instructions;
        int x = 0, y = 0;
        int r = 0;
        for (int i = 0; i < instructions.length(); i++) {
            if(instructions.charAt(i) == 'G'){
                if(r  == 0){
                    y++;
                }else if(r == -90){
                    x--;
                }else if(r == 90){
                    x++;
                }else if(r == -180){
                    y--;
                }else if(r == 180){
                    y--;
                }else if(r == -270){
                    x++;
                }else if(r == 270){
                    x--;
                }
            }else if(instructions.charAt(i) == 'L'){
                r -= 90;
                r %= 360;
            }else {
                r += 90;
                r %= 360;
            }
        }
        return (x == 0 && y == 0);
    }

    public static void main(String[] args) {
        System.out.println((-450) % 360);
    }
}
