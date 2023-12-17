package zakupki.database;

public abstract class BaseRepository<T> {
    public abstract void insert(T obj);
}
