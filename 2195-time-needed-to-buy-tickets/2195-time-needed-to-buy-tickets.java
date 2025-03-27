class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<tickets.length; i++){
            queue.add(i);
        }

        int seconds = 0;
        while(!queue.isEmpty()){
            int nextInLine = queue.poll();
            if(tickets[nextInLine] != 0 ){
                tickets[nextInLine]--;
                seconds++;
                if(tickets[nextInLine] > 0){
                    queue.add(nextInLine);
                }
            }
            if(nextInLine ==k && tickets[nextInLine] ==0 ){ break; }
        }
        return seconds;
    }
}