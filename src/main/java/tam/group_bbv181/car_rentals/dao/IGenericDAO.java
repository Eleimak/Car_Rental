package tam.group_bbv181.car_rentals.dao;

import java.util.List;

public interface IGenericDAO<T> {
    T create(T t);
    T get(String id);
    T update(T t);
    T delete(String id);
    List<T> getAll();
}
