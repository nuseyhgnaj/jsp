package pj.mvc.jsp.service;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pj.mvc.jsp.dao.CustomerDAO;
import pj.mvc.jsp.dao.CustomerDAOImpl;
import pj.mvc.jsp.dto.CustomerDTO;

public class CustomerServiceImpl implements CustomerService{

	@Override	// id 중복확인 처리
	public void idConfirmAction(HttpServletRequest req, HttpServletResponse res) 
		 throws ServletException, IOException{
		System.out.println("[ CustomerServiceImpl idConfirmAction: id 중복확인  처리 ]");
		
		// ***** 3단계 화면으로부터 입력받은 값을 받는다
		String strId = req.getParameter("id");
		
		// ****** 4단계. 싱글톤 방식으로 dao객체 생성, 다형성 적용
		CustomerDAO dao = CustomerDAOImpl.getInstance();
		
		
		// ***** 5단계 . 중복확인처리 
		int selectCnt = dao.idCheck(strId);
		
		// ***** 6단계. jsp로 처리 결과 전달(속성전달) => setAttribute("속성명", 값); 
		req.setAttribute("selectCnt", selectCnt);
		req.setAttribute("id", strId);
	
	}

	@Override 	// 회원가입 처리
	public void signInAction(HttpServletRequest req, HttpServletResponse res)
		 throws ServletException, IOException{
		
		System.out.println("[ CustomerServiceImpl signInAction: 회원가입 처리 ]");
		// ***** 3단계 화면으로부터 입력받은 값을 받는다
		//DTO 생성
		//setter
		CustomerDTO dto = new CustomerDTO();
		dto.setId(req.getParameter("id"));
		dto.setPassword(req.getParameter("password"));
//		//비밀번호 확인
//		dto.setPassword(req.getParameter("repassword"));
//		String repassword = req.getParameter("repassword");
		dto.setName(req.getParameter("name"));
		dto.setBirthday(Date.valueOf(req.getParameter("birthday")));
		dto.setAddress(req.getParameter("address"));
		//핸드폰은 필수가 아니므로 null값이 들어올 수 있으므로 값이 존재할 때만 받아온다
		String hp = "";
		String hp1 = req.getParameter("phone1");
		String hp2 = req.getParameter("phone2");
		String hp3 = req.getParameter("phone3");
		if(!hp1.equals("")&&!hp2.equals("")&&!hp3.equals("")) {
			hp = hp1 + "-" + hp2 + "-" + hp3;
		}
		dto.setHp(hp);
		//이메일
		String email = "";
		String email1 = req.getParameter("email1");
		String email2 = req.getParameter("email2");
		email = email1 + "@" + email2 ;
		dto.setEmail(email);
		
		//regDate는 입력값이 없으면 default로 sysdate를 설정했음, 아래 문장은 직접 값을 설정하는 경우
		dto.setRegDate(new Timestamp(System.currentTimeMillis()));

		// ****** 4단계. 싱글톤 방식으로 dao객체 생성, 다형성 적용
		// CustomerDAOImpl insertCustomer()
		// CustomerDAO (인터페이스)  ==> CustomerDAOImpl()
		CustomerDAO dao = CustomerDAOImpl.getInstance();
		
		// ***** 5단계 . 회원가입처리 
		int insertCnt = dao.insertCustomer(dto);				//insertCustomer(dto)의 리턴 타입은 int이므로 변수에 담아준다
		
		System.out.println(" ====>> CustomerServiceImpl signInAction insertCnt >> " + insertCnt);
		// ***** 6단계. jsp로 처리 결과 전달(속성전달) => setAttribute("속성명", 값); 
		req.setAttribute("insertCnt", insertCnt);			// object형으로 반환 ==> getAttribute()에서 type변형해야함
															//반환값 getAttribute ~> joinAction.jsp에서 <% %> 작 성
		
	
	}

	@Override	// 로그인 처리
	public void loginAction(HttpServletRequest req, HttpServletResponse res) 
		 throws ServletException, IOException{
		
	}

	@Override	// 회원정보 인증 및 탈퇴 처리
	public void deleteCustomerActioin(HttpServletRequest req, HttpServletResponse res) 
		 throws ServletException, IOException{
		
	}

	@Override	// 회원정보 인증 및 상세 페이지 (상세페이지 : 수정을 위한)
	public void modifyDetailAction(HttpServletRequest req, HttpServletResponse res) 
		 throws ServletException, IOException{
		
	}

	@Override	// 회원정보 수정 처리
	public void modifyCustomerAction(HttpServletRequest req, HttpServletResponse res) 
		 throws ServletException, IOException{
		
	}

}
