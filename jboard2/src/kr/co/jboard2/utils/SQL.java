package kr.co.jboard2.utils;

public class SQL {
	
	public static final String SELECT_TERMS 		= "SELECT * FROM JB_TERMS"; 
	public static final String SELECT_CHECK_UID 	= "SELECT COUNT(*) FROM JB_MEMBER WHERE uid=?";
	public static final String SELECT_CHECK_NICK 	= "SELECT COUNT(*) FROM JB_MEMBER WHERE nick=?";
	public static final String SELECT_CHECK_HP	 	= "SELECT COUNT(*) FROM JB_MEMBER WHERE hp=?";
	public static final String SELECT_CHECK_EMAIL 	= "SELECT COUNT(*) FROM JB_MEMBER WHERE email=?";
	public static final String INSERT_MEMBER 		= "INSERT INTO JB_MEMBER (uid, pass, name, nick, email, hp, zip, addr1, addr2, regip, rdate) VALUES (?,?,?,?,?,?,?,?,?,?,NOW())";	
	public static final String SELECT_MEMBER_LOGIN  = "SELECT * FROM JB_MEMBER WHERE uid=? AND pass=?";
	
	
	public static final String INSERT_BOARD = "INSERT INTO JB_BOARD SET cate=?, title=?, content=?, uid=?, regip=?, rdate=NOW()";
	public static final String SELECT_LIST  = "SELECT b.*, m.nick FROM JB_BOARD AS b "
											+ "JOIN JB_MEMBER AS m ON b.uid = m.uid "
											+ "WHERE parent = 0 "
											+ "ORDER BY seq DESC LIMIT ?, 10";
	
	public static final String SELECT_COUNT = "SELECT COUNT(*) FROM JB_BOARD WHERE parent= 0 ";
	public static final String SELECT_VIEW  = "SELECT * FROM JB_BOARD WHERE seq=?";
	
	public static final String INSERT_COMMENT = "INSERT INTO JB_BOARD SET "
											  + "parent=?, "
											  + "cate=?, "
											  + "content=?, "
											  + "uid=?, "
											  + "regip=?, "
											  + "rdate=NOW()";
	
	
}















