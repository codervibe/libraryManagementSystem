package com.codervibe.libraryManagementSystem.service;

import com.codervibe.libraryManagementSystem.domain.BookCategory;
import com.codervibe.libraryManagementSystem.utils.page.Page;

public interface IBookCategoryService {

    //图书类别分页查询
    public Page<BookCategory> selectBookCategoryByPageNum(int pageNum);

    int deleteBookCategoryById(int bookCategoryId);
}
