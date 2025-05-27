package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    public int minMeetingRooms(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(intervals[0][1]); // 0, 30

        for (int i = 1; i < intervals.length; i++) {
            int currentStartTime = intervals[i][0];
            int lastEndTime = minHeap.peek();
            if (currentStartTime < lastEndTime) {
                minHeap.offer(intervals[i][1]);
            } else {
                minHeap.poll();
                minHeap.offer(intervals[i][1]);
            }
        }
        return minHeap.size();
    }
}
