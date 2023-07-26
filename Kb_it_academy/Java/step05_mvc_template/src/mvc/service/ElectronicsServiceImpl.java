package mvc.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import mvc.dto.Electronics;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

/**
 * 전자제품에 관련된 기능을 담당할 클래스
 */

public class ElectronicsServiceImpl implements ElectronicsService {	
	String [][] data = new String [][]{
		{"100","선풍기","35000","삼성 선풍기"},
		{"200","전자렌지","55000","잘 데워져요.."},
		{"300","에어컨","5500000","무풍 에어컨 너무 시원해"},
		{"400","냉장고","800000","LG 냉장고"},
		{"500","드라이기","9000","LG 드라이기"}
	}; // 최초의 초기치 데이터를 준비!! electronics에 저장 
	
	
	private static ElectronicsService instance = new ElectronicsServiceImpl(); 
    private static final int MAX_SIZE=10;
    List<Electronics> list = new ArrayList<Electronics>();
    
    /** 
     * 외부에서 객체 생성안됨. 
     * 생성자안에서 위에 2차원 배열의 데이터를 List에 추가하여
     * 초기치 데이터를 만든다.
     * 
     */
    private ElectronicsServiceImpl() {
    	for(int i=0; i<data.length; i++) {
        	list.add(new Electronics(Integer.parseInt(data[i][0]), data[i][1], Integer.parseInt(data[i][2]), data[i][3]));
    	}
    }
    
    public static ElectronicsService getInstance() {
    	return instance;
    }

	@Override
	public void insert(Electronics electronics) throws ElectronicsArrayBoundsException {
		//사이즈 초과일 때 
		if(list.size() == MAX_SIZE) {
			throw new ElectronicsArrayBoundsException("최대 크기를 초과했습니다.");
		}
		//중복일 때 
		try {
			this.searchByModelNo(electronics.getModelNo());
			throw new ElectronicsArrayBoundsException("모델번호 오류로 등록이 불가합니다.");
		} catch (SearchNotFoundException e) {
			list.add(electronics);
		}
	}

	@Override
	public List<Electronics> selectAll() {
		return list;
	}

	@Override
	public Electronics searchByModelNo(int modelNo) throws SearchNotFoundException {
		for(Electronics elec : list) {
			if(elec.getModelNo() == modelNo) {
				return elec;
			}
		}
		throw new SearchNotFoundException(modelNo + "는 없는 모델번호로 검색 불가");
	}

	@Override
	public List<Electronics> sortPrice() {
		List<Electronics> sortPriceList = new ArrayList<>(list);
		Collections.sort(sortPriceList, new Comparator<Electronics>() {
			@Override
			public int compare(Electronics o1, Electronics o2) {
				return o1.getModelPrice() - o2.getModelPrice();
			}
		});
		return sortPriceList;
	}
	
	@Override
	public List<Electronics> sortModelNameLength() {
		List<Electronics> sortModelNameLengthList = new ArrayList<>(list);
		Collections.sort(sortModelNameLengthList, new Comparator<Electronics>() {
			@Override
			public int compare(Electronics o1, Electronics o2) {
				return o1.getModelName().length() - o2.getModelName().length();
			}
		});
		return sortModelNameLengthList;
	}

	@Override
	public void update(Electronics electronics) throws SearchNotFoundException {
		Electronics elec = this.searchByModelNo(electronics.getModelNo());
		elec.setModelDetail(electronics.getModelDetail());
	}

	@Override
	public void delete(int modelNo) throws SearchNotFoundException {
		for(Electronics elec : list) {
			if(elec.getModelNo() == modelNo) {
				list.remove(elec);
				return;
			}
		}
		throw new SearchNotFoundException(modelNo + "는 없는 모델번호로 삭제 불가");
	}
    
} // 클래스 끝 