package pj.mvc.jsp.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerServiceImpl implements CustomerService{

	@Override	// id 중복확인 처리
	public void idConfirmAction(HttpServletRequest req, HttpServletResponse res) {
		
	}

	@Override 	// 회원가입 처리
	public void signInAction(HttpServletRequest req, HttpServletResponse res) {
		
	}

	@Override	// 로그인 처리
	public void loginAction(HttpServletRequest req, HttpServletResponse res) {
		
	}

	@Override	// 회원정보 인증 및 탈퇴 처리
	public void deleteCustomerActioin(HttpServletRequest req, HttpServletResponse res) {
		
	}

	@Override	// 회원정보 인증 및 상세 페이지 (상세페이지 : 수정을 위한)
	public void modifyDetailAction(HttpServletRequest req, HttpServletResponse res) {
		
	}

	@Override	// 회원정보 수정 처리
	public void modifyCustomerAction(HttpServletRequest req, HttpServletResponse res) {
		
	}

}