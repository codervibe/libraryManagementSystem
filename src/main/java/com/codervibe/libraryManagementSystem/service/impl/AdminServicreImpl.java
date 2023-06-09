package com.codervibe.libraryManagementSystem.service.impl;

import com.codervibe.libraryManagementSystem.domain.*;

import com.codervibe.libraryManagementSystem.mapper.AdminMapper;
import com.codervibe.libraryManagementSystem.mapper.BookCategoryMapper;
import com.codervibe.libraryManagementSystem.mapper.BookMapper;
import com.codervibe.libraryManagementSystem.service.IAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServicreImpl implements IAdminService {

    @Resource
    private AdminMapper adminMapper;

    @Resource
    private BookMapper bookMapper;

    @Resource
    private BookCategoryMapper bookCategoryMapper;
    @Override
    public boolean adminIsExist(String name) {
        AdminExample adminExample=new AdminExample();
        AdminExample.Criteria criteria=adminExample.createCriteria();
        criteria.andAdminNameEqualTo(name);
        List<Admin> admin=adminMapper.selectByExample(adminExample);
        if(null==admin)
        return false;
        if(admin.size()<1){
            return false;
        }
        return true;
    }

    @Override
    public boolean adminLogin(String name, String password) {
        AdminExample adminExample=new AdminExample();
        AdminExample.Criteria criteria=adminExample.createCriteria();
        criteria.andAdminNameEqualTo(name);
        List<Admin> admin=adminMapper.selectByExample(adminExample);
        if(null==admin){
            return false;
        }
        for(Admin a:admin){
            if(a.getAdminPwd().equals(password)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addBook(Book book) {
        int n=bookMapper.insert(book);
        if(n>0){
            return true;
        }
        return false;
    }

    @Override
    public List<BookCategory> getBookCategorys() {
        BookCategoryExample bookCategoryExample=new BookCategoryExample();
        return bookCategoryMapper.selectByExample(bookCategoryExample);
    }

    @Override
    public boolean addBookCategory(BookCategory bookCategory) {
        int n=bookCategoryMapper.insert(bookCategory);
        if(n>0){
            return true;
        }
        return false;
    }
}
