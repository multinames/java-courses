package Lesson6;

public class CloseApp implements AutoCloseable {
    public CloseApp() throws Exception{
        System.out.println("Экземпляр CloseApp создан");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Ресурсы зкрыты");
    }
}
