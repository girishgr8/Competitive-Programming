class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0], y1 = coordinates[0][1];
        int x2 = coordinates[1][0], y2 = coordinates[1][1];
        /* Fact 1: Two points are always collinear */
        double m = (double)(y2-y1)/(double)(x2-x1);
        /* Get the slope of line defined by these two points */
        for(int i=2; i<coordinates.length; i++){
            /* Check if after substituting the new point in the line equation, LHS == RHS or not */
            int x = coordinates[i][0], y = coordinates[i][1];
            double LHS = (y-y1);
            double RHS = m*(x-x1);
            if(LHS!=RHS)
                return false;
        }
        return true;
    }
}