package Greedy;

import java.util.Arrays;
import java.util.PriorityQueue;

public class CourseScheduleIII {
    public int scheduleCourse(int[][] courses) {

        Arrays.sort(courses, (a, b) -> a[1] - b[1]);
        // [100,200],[1000,1250],[200,1300],[2000,3200]]
        // maxHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        // [2000,3200],[200,1300],[1000,1250],[100,200]]
        int totalDuration = 0;
        for (int i = 0; i < courses.length; i++) {
            int duration = courses[i][0]; // 100 //1000 // 200 // 2000
            int lastDay = courses[i][1]; // 200 // 1250 //1300 // 3200

            totalDuration += duration; // 100 + 1000 + 200 + 2000 = 3300
            pq.add(duration);

            while (totalDuration > lastDay) {
                totalDuration -= pq.poll();
            }
        }
        return pq.size();
    }
}
