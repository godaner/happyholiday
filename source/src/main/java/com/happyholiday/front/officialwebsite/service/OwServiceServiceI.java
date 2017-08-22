package com.happyholiday.front.officialwebsite.service;

import java.util.List;

import com.happyholiday.front.officialwebsite.exception.OfficialwebsiteException;
import com.happyholiday.front.officialwebsite.pageModel.PageOwIndexCarousel;
import com.happyholiday.front.officialwebsite.pageModel.PageOwNews;
import com.happyholiday.front.officialwebsite.pageModel.PageOwService;
import com.happyholiday.front.officialwebsite.util.OwFrontReturnJSON;

public interface OwServiceServiceI {

	

	OwFrontReturnJSON<PageOwService> getService(PageOwService pageModel) throws OfficialwebsiteException;

	

	
}
