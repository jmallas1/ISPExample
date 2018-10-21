package isp.lab1;

public interface Machine
{
    public void run(int distance);
    public void start();
    public void drive(int distance);
    public void stopByBreaking();
}
