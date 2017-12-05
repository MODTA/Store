package com.onlineStroe.dao.DealCategory;

import com.onlineStroe.enty.DealCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/11/27.
 */
@Repository
public interface DealCategoryDao {

    public List<DealCategory> selectAllWithoutDeleted();

    public DealCategory selectByUrlName(String urlName);


}
