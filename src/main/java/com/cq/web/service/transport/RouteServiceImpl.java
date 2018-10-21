package com.cq.web.service.transport;

import com.cq.web.entity.transport.Route;
import com.cq.web.repository.BaseRepository;
import com.cq.web.repository.transport.RouteRepository;
import com.cq.web.service.admin.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Celine Q
 * @create: 2018-10-21 17:44
 **/
@Service
public class RouteServiceImpl extends BaseServiceImpl<Route,Integer> implements RouteService {

    @Autowired
    private RouteRepository routeRepository;

    @Override
    public BaseRepository<Route, Integer> getBaseRespository() {
        return routeRepository;
    }


    @Override
    public void saveOrUpdate(Route route) {
        if(route.getId() !=null ){
            Route r = routeRepository.findOne(route.getId());
            r.setName(route.getName());
            r.setFlight(route.getFlight());
            r.setDes(route.getDes());
            r.setDep(route.getDep());
            r.setRemark(route.getRemark());
            update(r);
        }else
            save(route);

    }
}

