package hbi.core.exam.dto;

/**
 * Created by 袁媛 on 2017/1/11.
 */
public class Page<T> {//当前第几页
    private int currentPage;
    private int pageSize;
    private T entity;
    private int startPage;
    public int getCurrentPage() {
        return currentPage;
    }

    public Page<T> setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    public int getPageSize() {
        return pageSize;
    }

    public Page<T> setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public int getStartPage() {
        return (currentPage - 1) * pageSize;
    }

    public T getEntity() {
        return entity;
    }

    public Page<T> setEntity(T entity) {
        this.entity = entity;
        return this;
    }
}


