package Stream;

import java.time.Duration;
import java.time.Instant;
import java.util.OptionalLong;
import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;

public class TestTStreamhread {
    public static void main(String[] args) {
        Instant start=Instant.now();
        /**
         * 使用串行流五百亿求和
         */
        long sum=0;
        for (long i=0;i<50000000000L;i++){
            sum+=i;
        }
        System.out.println(sum);
        Instant end =Instant.now();
        System.out.println("500亿求和需要花费的时间"+Duration.between(start,end).toMillis()+"毫秒");
        /**
         * 使用并行流计算五百亿求和，
         */
        /*Instant start1=Instant.now();
        LongStream longSream= LongStream.rangeClosed(0,50000000000L);
        OptionalLong result=longSream.parallel().reduce(new LongBinaryOperator() {
            @Override
            public long applyAsLong(long left, long right) {
                return left+right;
            }
        });
        //使用多线程处理，大的任务拆分成n个小任务再计算，之后将结果合并
        System.out.println(result.getAsLong());
        Instant end1 =Instant.now();
        System.out.println("500亿求和需要花费的时间"+Duration.between(start1,end1).toMillis()+"毫秒");*/
    }
}
