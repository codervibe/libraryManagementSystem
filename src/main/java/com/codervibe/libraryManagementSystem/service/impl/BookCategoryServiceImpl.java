package com.codervibe.libraryManagementSystem.service.impl;

import com.codervibe.libraryManagementSystem.domain.BookCategory;
import com.codervibe.libraryManagementSystem.utils.page.Page;
import com.codervibe.libraryManagementSystem.mapper.BookCategoryMapper;
import com.codervibe.libraryManagementSystem.service.IBookCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookCategoryServiceImpl implements IBookCategoryService {

    @Resource
    private BookCategoryMapper bookCategoryMapper;
    @Override
    public Page<BookCategory> selectBookCategoryByPageNum(int pageNum) {
        Page<BookCategory> page=new Page<>();
        List<BookCategory> list=bookCategoryMapper.selectByPageNum((pageNum-1)*10,10);
        page.setPageSize(10);
        page.setPageNum(pageNum);
        page.setList(list);
        int recordCount=bookCategoryMapper.selectAllCount();
        int pageCount=recordCount/10;
        if(recordCount%10!=0){
            pageCount++;
        }
        page.setPageCount(pageCount);
        return page;
    }

    @Override
    public int deleteBookCategoryById(int bookCategoryId) {
        return bookCategoryMapper.deleteByPrimaryKey(bookCategoryId);
    }
}
