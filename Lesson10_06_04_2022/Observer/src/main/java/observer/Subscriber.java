package observer;

public class Subscriber implements BaseSub{
    public static <T> T as(Class<T> clazz, Object o){
        if(clazz.isInstance(o)){
            return clazz.cast(o);
        }
        return null;
    }
    private String msg;

    public Subscriber() {
    }

    public Subscriber(String msg) {
        this.msg = msg;
    }

    @Override
    public void Update(BasePub publisher) {
        if (as((Publisher.class),publisher).State < 3)
        {
            System.out.println("Sub №"+ msg  +": Reacted to the event."  );
        }
    }
}