package class1.ex;

public class MaxCounter {
    private int count;

    int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment(){

        // 검증 로직
        if(count >= max){
            System.out.println("최대값을 초가할 수 없습니다.");
            return;
        }

        // 실행 로직
        count++;
    }

    public int getCount(){
        return count;
    }
}
