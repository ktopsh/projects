package kr.co.jboard2.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.jboard2.controller.CommandAction;
import kr.co.jboard2.dao.BoardDAO;
import kr.co.jboard2.vo.BoardVO;
import kr.co.jboard2.vo.MemberVO;

public class WriteService implements CommandAction {

	@Override
	public String requestProc(HttpServletRequest request, HttpServletResponse response) {
		
		String method = request.getMethod();
		
		if(method.equals("POST")) {
			
			String cate    = request.getParameter("cate");
			String title   = request.getParameter("subject");
			String content = request.getParameter("content");
			String uid 	   = request.getParameter("uid");
			String regip   = request.getRemoteAddr();
			
			BoardVO vo = new BoardVO();
			vo.setCate(cate);
			vo.setTitle(title);
			vo.setContent(content);
			vo.setUid(uid);
			vo.setRegip(regip);
			
			BoardDAO dao = BoardDAO.getInstance();
			
			try {
				dao.write(vo);
			} catch (Exception e) {
				e.printStackTrace();
			}	
			
			return "redirect:/jboard2/list.do";
		}else {
			
			/*
			HttpSession session = request.getSession();
			MemberVO member = (MemberVO)session.getAttribute("member");
			
			if(member == null) {
				
			}else {
				
			}
			*/
			
			
			return "/write.jsp";
		}
	}

}
