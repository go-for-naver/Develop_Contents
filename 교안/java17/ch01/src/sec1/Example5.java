package sec1;

public class Example5 {

    public static void main(String[] args) {

        byte b1 = 104;
//        byte b2 = -129;               // 해당 표현범위보다 작음 (언더플로우)
//        byte b3 = 128;                // 해당 표현범위보다 큼 (오버플로우)

        char c1 = 'k';                  // 범위: 0 ~ 65535
//        char c2 = -1;                             // 언더플로우
//        char c3 = 65548;                          // 오버플로우

        short s1 = 365;
//        short s2 = -32769;                        // 언더플로우
//        short s3 = 32768;                         // 오버플로우

        int i1 = 800;
//        int i2 = -2147483649;                     // 언더플로우
//        int i3 = 31859303824;                     // 오버플로우
        
        long l1 = 922337203L;
//        long l2 = -39485748392345198590L;         // 언더플로우
//        long l3 = 22587569823365478562L;          // 오버플로우

        float f1 = 3.14f;
//        float f2 = -3.1428235E439f;               // 언더플로우
//        float f3 = 3.1428235E39f;                 // 오버플로우

        double d1 = 3.141592;
//        double d2 = -1.7976931348623157E317;      // 언더플로우
//        double d3 = 1.7976931348623157E310;       // 오버플로우

    }

}
