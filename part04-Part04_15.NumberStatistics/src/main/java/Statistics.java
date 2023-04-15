
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return sum;
    }
    
    public double average() {
        double average;
        if (this.count == 0){
            average = 0;
        } else {
            return (double) 1.0* this.sum / this.count;
        }
        return average;
    }


}
