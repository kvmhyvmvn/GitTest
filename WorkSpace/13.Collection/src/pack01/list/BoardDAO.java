package pack01.list;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {

	// dao.getList() 메소드: BoardDAO가 인스턴스화 과정을 거쳐 dao라는 이름의 객체가 되고, dao.찍으면 나옴.(인스턴스 멤버)
	// BoardDTO를 3건 가진 - 3건 add 시키면 됨
	// List를 return하는 메소드임 - List<BoardDTO>를 리턴해줘야함
	public List<BoardDTO> getList() {
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		list.add(new BoardDTO(1, "제목1", "내용1"));
		list.add(new BoardDTO(2, "제목2", "내용2"));
		list.add(new BoardDTO(3, "제목3", "내용3"));
		return list;
	}

	public void getDisplay(List<BoardDTO> list) {
		for(BoardDTO dto:list) {
			System.out.print(dto.getBoardNum() + " ");
			System.out.print(dto.getBoardTitle() + " ");
			System.out.println(dto.getBoardContent());
		}

	}
}
