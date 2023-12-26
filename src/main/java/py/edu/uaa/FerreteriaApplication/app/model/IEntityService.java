package py.edu.uaa.FerreteriaApplication.app.model;

import java.util.List;

public interface IEntityService<T, ID> {
    List<T> findAll();

    T findById(ID id);

    T create(T entity);

    T update(T entity);

    void delete(ID id);
}
