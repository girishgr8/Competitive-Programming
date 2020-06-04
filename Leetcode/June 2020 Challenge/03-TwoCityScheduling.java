class Pair{
    int profit, index;
    Pair(int profit, int index){
        this.profit = profit;
        this.index = index;
    }
}

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b) -> a.profit-b.profit);
        int idx = 0, total = 0, n = costs.length;
        for(int i=0; i<n; i++){
            int profit = costs[i][0]-costs[i][1];
            pq.add(new Pair(profit,i));
        }
        while(pq.size()!=0){
            Pair p = pq.poll();
            if(idx++<n/2) total += costs[p.index][0];
            else total += costs[p.index][1];
        }
        return total;
    }
}