package cn.hackcoder;

/**
 * 1450. Number of Students Doing Homework at a Given Time
 */
public class NumberOfStudentsDoingHomeworkAtAGivenTime {
	public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		int res = 0;
		for (int i = 0; i < startTime.length; i++) {
			if (startTime[i] <= queryTime && endTime[i] >= queryTime) res++;
		}
		return res;
	}

	public static void main(String[] args) {
	}
}
