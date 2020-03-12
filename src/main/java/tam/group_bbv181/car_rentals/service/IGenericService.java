package tam.group_bbv181.car_rentals.service;

import java.util.List;

public interface IGenericService<T> {
    T create(T t);
    T get(String id);
    T update(T t);
    T delete(String id);
    List<T> getAll();
}
