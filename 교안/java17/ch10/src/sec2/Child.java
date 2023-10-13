package sec2;

class Parent {  }

class My extends Parent {  }
class Brother extends Parent {  }
class Sister extends Parent {  }
class Sibling extends Parent {  }
class Season extends My {  }
class Sesaw extends Brother {  }
public class Child<T extends My> {              // My (My, Season, Child) 이하만 가능
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }

    

}
