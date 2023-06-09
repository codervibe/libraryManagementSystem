package com.codervibe.libraryManagementSystem.service;

import com.codervibe.libraryManagementSystem.domain.BookCategory;
import com.codervibe.libraryManagementSystem.domain.Book;

import java.util.List;

public interface IAdminService {

    //验证用户是否存在
    public boolean adminIsExist(String name);
    //管理员登陆

    public boolean adminLogin(String name,String password);

    //录入新书
    public boolean addBook(Book book);

    //获取所有图书类别
    public List<BookCategory> getBookCategorys();

    //增加图书类别
    public boolean addBookCategory(BookCategory bookCategory);
}
