package sec1;

// Type(T), Element(E): 필드/속성, Key(K), Number(N), Value(V), Result(R), Question/Query(Q), Generic(G)... 에서 첫 번째 글자만 약어로 만들어 인자를 사용하는 것이 관례
// public class 클래스명<인자> {  }
public class Gen2<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
