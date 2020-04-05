package homwork;

import java.util.Comparator;

public class BoardComparator implements Comparator<BoardVo>{

	@Override
	public int compare(BoardVo s1, BoardVo s2) {
		int r =0;
		if(s1==null || s2==null) {
			r = 0;
		}else {
			r = s2.getmDate().compareTo(s1.getmDate());
		}
		return r;
		/*
		if(s1!==null || s2!==null) {
			r = s2.getmDate().compareTo(s1.getmDate());
		}
		*/
	}
}


