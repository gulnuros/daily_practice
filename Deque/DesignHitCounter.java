package Deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class DesignHitCounter {
    class HitCounter {

        Queue<Integer> hits;

        public HitCounter() {
            hits = new ArrayDeque<>();
        }

        public void hit(int timestamp) {
            hits.add(timestamp); // 1,3, 4,6,8, 300, 305, nth
        }

        public int getHits(int timestamp) {
            // 301 - 299 = 2
            int count = 0;
            if (timestamp <= 300) {
                for (int hit : hits) {
                    if (hit <= timestamp)
                        count++;
                }
                return count;
            } else {
                int start = 0;
                start = timestamp - 299; // 2
                for (int hit : hits) {
                    if (hit >= start && hit <= timestamp)
                        count++;
                }
                return count;
            }

        }
    }

    /**
     * Your HitCounter object will be instantiated and called as such:
     * HitCounter obj = new HitCounter();
     * obj.hit(timestamp);
     * int param_2 = obj.getHits(timestamp);
     */
}
