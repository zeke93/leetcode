package cn.hackcoder;

import java.util.*;

/**
 * Created by linzhichao on 2017/8/8.
 */
public class ExclusiveTimeOfFunctions {


    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<Log> logStack = new Stack<>();
        logs.forEach(log -> {
            String[] strs = log.split(":");
            Log l = new Log(Integer.parseInt(strs[0]), strs[1], Integer.parseInt(strs[2]));
            logStack.push(l);
        });

        Map<Integer, Integer> result = new HashMap<>();
        while (!logStack.isEmpty()) {
            Log log = logStack.pop();
            System.out.println(log);
        }
        return new int[1];
    }


    public static void main(String[] args) {
        new ExclusiveTimeOfFunctions().exclusiveTime(2, Arrays.asList("0:start:0",
                "1:start:2",
                "1:end:5",
                "0:end:6"));
    }

    class Log {
        private int functionId;
        private String flag;
        private int timestamp;

        public Log(int functionId, String flag, int timestamp) {
            this.functionId = functionId;
            this.flag = flag;
            this.timestamp = timestamp;
        }

        public Log() {
        }

        public int getFunctionId() {
            return functionId;
        }

        public void setFunctionId(int functionId) {
            this.functionId = functionId;
        }

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        @Override
        public String toString() {
            return "Log{" +
                    "functionId=" + functionId +
                    ", flag='" + flag + '\'' +
                    ", timestamp=" + timestamp +
                    '}';
        }
    }

}
