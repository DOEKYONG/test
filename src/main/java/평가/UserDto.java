package 평가;

public class UserDto {
	private int 회원번호;
	private String 아이디;
	private String 비밀번호;
	private String 회원이름;
	private String 회원이메일;
	
	public UserDto() {
		// TODO Auto-generated constructor stub
	}

	public UserDto(int 회원번호, String 아이디, String 비밀번호, String 회원이름, String 회원이메일) {
		super();
		this.회원번호 = 회원번호;
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
		this.회원이름 = 회원이름;
		this.회원이메일 = 회원이메일;
	}

	public int get회원번호() {
		return 회원번호;
	}

	public void set회원번호(int 회원번호) {
		this.회원번호 = 회원번호;
	}

	public String get아이디() {
		return 아이디;
	}

	public void set아이디(String 아이디) {
		this.아이디 = 아이디;
	}

	public String get비밀번호() {
		return 비밀번호;
	}

	public void set비밀번호(String 비밀번호) {
		this.비밀번호 = 비밀번호;
	}

	public String get회원이름() {
		return 회원이름;
	}

	public void set회원이름(String 회원이름) {
		this.회원이름 = 회원이름;
	}

	public String get회원이메일() {
		return 회원이메일;
	}

	public void set회원이메일(String 회원이메일) {
		this.회원이메일 = 회원이메일;
	}
	
	

}
