package com.internousdev.amoti.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.amoti.dao.CartInfoDAO;
import com.internousdev.amoti.dao.DestinationInfoDAO;
import com.internousdev.amoti.dao.MCategoryDAO;
import com.internousdev.amoti.dao.UserInfoDAO;
import com.internousdev.amoti.dto.DestinationInfoDTO;
import com.internousdev.amoti.dto.MCategoryDTO;
import com.internousdev.amoti.dto.UserInfoDTO;
import com.internousdev.amoti.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private String loginId;
	private String password;
	private boolean savedLoginIdFlg;
	private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();
	private List<String> loginIdErrorMessageList = new ArrayList<String>();
	private List<String> passwordErrorMessageList = new ArrayList<String>();
	private Map<String, Object> session;

	public String execute(){
		String result = ERROR;

		loginIdErrorMessageList = null;
		passwordErrorMessageList = null;

		if(savedLoginIdFlg == true){
			session.put("savedLoginIdFlg", true);
			session.put("savedLoginId", loginId);
		}else{
			session.put("savedLoginIdFlg", false);
			session.remove("savedLoginId");
		}
//IDとパスワードの文字数、文字種制限をします//
		InputChecker inputChecker = new InputChecker();
		loginIdErrorMessageList = inputChecker.doCheck("ログインID", loginId, 1, 8, true, false, false, true, false, false, false);
		passwordErrorMessageList = inputChecker.doCheck("パスワード", password, 1, 16, true, false, false, true, false, false, false);
//IDが空ならログインせずにエラーメッセージを返します//
		if(!(loginIdErrorMessageList.isEmpty())){
			session.put("loginIdErrorMessageList", loginIdErrorMessageList);
			session.put("logined", 0);
		}
//パスワードも同様//
		if(!(passwordErrorMessageList.isEmpty())){
			session.put("passwordErrorMessageList", passwordErrorMessageList);
			session.put("logined", 0);
		}

		if(!session.containsKey("mCategoryList")){
			MCategoryDAO mCategoryDao = new MCategoryDAO();
			mCategoryDtoList = mCategoryDao.getMCategoryList();
			session.put("mCategoryDtoList", mCategoryDtoList);
		}
//ユーザーログイン//
		UserInfoDAO userInfoDAO = new UserInfoDAO();
		UserInfoDTO userInfoDTO = userInfoDAO.getUserInfo(loginId, password);
		if(userInfoDAO.isExistsUserInfo(loginId, password)){
			if(userInfoDAO.login(loginId, password) > 0){
				session.put("loginId", userInfoDTO.getUserId());
				int count=0;
				CartInfoDAO cartInfoDao = new CartInfoDAO();

				count = cartInfoDao.linkToLoginId(String.valueOf(session.get("tempUserId")),loginId);
				if(count > 0){
					DestinationInfoDAO destinationInfoDao = new DestinationInfoDAO();
					try{
						List<DestinationInfoDTO> destinationInfoDtoList = new ArrayList<DestinationInfoDTO>();
						destinationInfoDtoList = destinationInfoDao.getDestinationInfo(loginId);
						Iterator<DestinationInfoDTO> iterator = destinationInfoDtoList.iterator();
						if(!(iterator.hasNext())){
							destinationInfoDtoList = null;
						}
						session.put("destinationInfoDtoList", destinationInfoDtoList);
					}catch(SQLException e){
						e.printStackTrace();
					}
					result = "settlement";
				}else{
					result = SUCCESS;
				}
			}
			session.put("logined", 1);
		}else if(userInfoDAO.isExistsUserInfo(loginId)){
			session.put("passwordErrorMessageList", "入力されたパスワードが異なります。");
			session.put("logined", 0);
		}
		return result;
	}

	public List<MCategoryDTO> getmCategoryDtoList() {
		return mCategoryDtoList;
	}

	public void setmCategoryDtoList(List<MCategoryDTO> mCategoryDtoList) {
		this.mCategoryDtoList = mCategoryDtoList;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isSavedLoginIdFlg() {
		return savedLoginIdFlg;
	}

	public void setSavedLoginIdFlg(boolean savedLoginIdFlg) {
		this.savedLoginIdFlg = savedLoginIdFlg;
	}

	public List<String> getLoginIdErrorMessageList() {
		return loginIdErrorMessageList;
	}

	public void setLoginIdErrorMessageList(List<String> loginIdErrorMessageList) {
		this.loginIdErrorMessageList = loginIdErrorMessageList;
	}

	public List<String> getPasswordErrorMessageList() {
		return passwordErrorMessageList;
	}

	public void setPasswordErrorMessageList(List<String> passwordErrorMessageList) {
		this.passwordErrorMessageList = passwordErrorMessageList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
