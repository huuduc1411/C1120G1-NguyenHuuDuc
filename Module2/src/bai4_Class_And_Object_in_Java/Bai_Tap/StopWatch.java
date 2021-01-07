package bai4_Class_And_Object_in_Java.Bai_Tap;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch() {
    }
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public void startTime(){
        this.startTime = System.currentTimeMillis();
    }
    public void endTime(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.startTime();
        System.out.println("Start time: " + stopWatch.getStartTime());
        for(int i = 0; i < 800000; i ++){
            for(int j = 0; j < 800000; j ++){
            }
        }
        stopWatch.endTime();
        System.out.println("End time: " + stopWatch.getEndTime());
        System.out.println("Elapsed: " + stopWatch.getElapsedTime());
    }
}
