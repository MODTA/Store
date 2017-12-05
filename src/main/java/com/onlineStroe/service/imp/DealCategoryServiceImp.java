package com.onlineStroe.service.imp;

import com.onlineStroe.dao.DealCategory.DealCategoryDao;
import com.onlineStroe.enty.DealCategory;
import com.onlineStroe.service.DealCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/11/27.
 */
@Service
public class DealCategoryServiceImp implements DealCategoryService {
    @Autowired
    DealCategoryDao dealCategoryDao;

    public List<DealCategory> selectAllWithoutDeleted() {

        return dealCategoryDao.selectAllWithoutDeleted();


    }

    public List<DealCategory> getCategories() {
            List<DealCategory> dealCategories = selectAllWithoutDeleted();

        List<DealCategory> roots = dealCategories.stream().filter(dealCategory -> (dealCategory.getParentID()==0)).collect(Collectors.toList());

        List<DealCategory> subs = dealCategories.stream().filter(dealCategory -> (dealCategory.getParentID()!= 0)).collect(Collectors.toList());

        roots.forEach(root -> buildSubs(root, subs));
        return roots;
    }

    @Override
    public DealCategory selectByUrlName(String urlName) {
        return dealCategoryDao.selectByUrlName(urlName);
    }

    private void buildSubs(DealCategory parents,List<DealCategory> subs) {
        List<DealCategory> children = subs.stream().filter(sub -> (sub.getParentID() == parents.getId())).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(children)){
            parents.setChildren(children);
        }
    }
}