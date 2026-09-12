package in.nkn.service;

import java.util.List;

import in.nkn.model.Tourist;

public interface ITourisMgmtService {
	
	public String registerTouris(Tourist tourist);
	public List<Tourist> fetchAllTourist();
    public Tourist fetchTouristById(Integer id);
	public String updateTouristByDetails(Tourist tourist);
	public String updateTouristById(Integer id,Float hikePercent);
	public String deleteTouristById(Integer id);

}
