class Solution {
    public int findJudge(int N, int[][] trust) {
        /* incomingEdges array stores the count for an individual who is trusted by others */
        int incomingEdges[] = new int[N];
        /* outgoingEdges array stores the count for number of persons are trusted by an individual */
        int outgoingEdges[] = new int[N];
        /* [a,b] means person a trusts b 
            Increment count for person b as incoming edge 
            Increment count for person a as outgoing edge */
        for(int i=0; i<trust.length; i++){
            incomingEdges[trust[i][1]-1]++;
            outgoingEdges[trust[i][0]-1]++;
        }
        /* If the person has N-1 incoming edges(everybody except town judge trusts him),
           and zero outgoing edges(he trusts nobody), then person i is the town judge */
        for(int i=0; i<arr.length; i++)
            if(incomingEdges[i]==N-1 && outgoingEdges[i]==0)
                return (i+1);
        return -1;
    }
}