public class Singleton {
    private int nbrExecution = 0;
    // - Instance
    private static Singleton instance = null;

    // - Singleton
    private Singleton()
    {
        System.out.println("Constructeur singleton" + nbrExecution);
        nbrExecution++;

    }

    // + getInstance()
    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}
