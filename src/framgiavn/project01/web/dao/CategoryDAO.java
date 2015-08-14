package framgiavn.project01.web.dao;

import java.util.List;

import framgiavn.project01.web.model.Category;

public interface CategoryDAO {
    Category show(int categoryId) throws Exception;

    List<Category> index() throws Exception;

    void create(Category category) throws Exception;

    void update(Category category) throws Exception;

    void destroy(Category category) throws Exception;
}
