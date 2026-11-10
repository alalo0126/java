public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    //1. 오븐 예상 시간을 분 단위로 정의해요 (요리책 기준 40분)
    public int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    // 2. 남은 오븐 시간을 분 단위로 계산해요
    public int remainingMinutesInOven(int X) {
        return expectedMinutesInOven() - X;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    // 3. 준비 시간을 분 단위로 계산해요 (한 층당 2분 소요)
    public int preparationTimeInMinutes(int y) {
        return y * 2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    // 4. 총 작업 시간을 분 단위로 계산해요 (준비 시간 + 오븐에 있던 시간)
    public int totalTimeInMinutes(int y, int X) {
        return preparationTimeInMinutes(y) + X;
    }
}
