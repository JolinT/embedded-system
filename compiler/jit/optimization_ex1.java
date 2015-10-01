// source: http://blog.dontcareabout.us/2013/03/jit-compiler.html
/* Before Optimization */
class Calculator {
     Wrapper wrapper;
     public void calculate() {
         y = wrapper.get();
         z = wrapper.get();
         sum = y + z;
     }
 }

class Wrapper {
    final int value;
    final int get() {
        return value;
    }
}

/* After Optimization */
class Calculator{
    Wrapper wrapper;
    public void calculate(){
        y = wrapper.value;
        sum = y + y;
    }
}

class Wrapper {
    final int value;
    final int get() {
        return value;
    }
}
