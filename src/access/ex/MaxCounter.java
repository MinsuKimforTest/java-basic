package access.ex;

public class MaxCounter {

    private int count;
    private int max;
    public MaxCounter(int max){
        this.max = max;
    }
    void increment(){
        if(isValid()){
            this.count ++;
        }else{
            System.out.println("최대값을 넘길 수 없습니다.");
        }

    }

    int getCount(){
        return count;
    }

    boolean isValid() {
        return this.count < this.max;
    }
}
