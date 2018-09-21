package kr.co.jboard2.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.jboard2.controller.CommandAction;
import kr.co.jboard2.dao.BoardDAO;
import kr.co.jboard2.vo.BoardVO;

public class ViewService implements CommandAction{

	@Override
	public String requestProc(HttpServletRequest request, HttpServletResponse response) {
	
		String seq = request.getParameter("seq");
		String pg = request.getParameter("pg");
		
		BoardDAO dao = BoardDAO.getInstance();
		BoardVO vo = null;
		try {
			vo = dao.view(seq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		request.setAttribute("vo", vo);
		request.setAttribute("pg", pg);
		
		return "/view.jsp";
	}
}
















