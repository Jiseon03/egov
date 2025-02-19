package egovframework.com.main.service.impl;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.com.main.service.MainService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("MainService")
public class MainServiceImpl extends EgovAbstractServiceImpl implements MainService{
		@Resource(name="MainDAO")
		private MainDAO mainDAO;

		@Override
		public int selectIdChk(HashMap<String, Object> paramMap) {
			// TODO Auto-generated method stub
			return mainDAO.selectIdChk(paramMap);
		}
}
