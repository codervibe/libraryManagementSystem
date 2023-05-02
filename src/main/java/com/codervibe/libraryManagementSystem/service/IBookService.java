package com.codervibe.libraryManagementSystem.service;

import com.codervibe.libraryManagementSystem.utils.page.Page;
import com.codervibe.libraryManagementSystem.domain.Vo.BookVo;

import java.util.List;

public interface IBookService {

    /**
     * 根据书名查找书籍
     * @param bookName
     * @return
     */
    public List<BookVo> findBooksByBookName(String bookName);

    /**
     * 根据书籍种类id查找书籍,分页查找
     * @param categoryId
     * @return
     */
    public Page<BookVo> findBooksByCategoryId(int categoryId, int pageNum);
}
