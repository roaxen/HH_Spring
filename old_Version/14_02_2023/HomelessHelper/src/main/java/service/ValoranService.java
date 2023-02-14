package service;

import java.util.List;

import model.Valoran;

public interface ValoranService {
	boolean addValoran(Valoran valoran);

	List<Valoran> retrieveValoran();

	boolean updateValoran(Valoran valoran);

	boolean deleteValoran(int id);

	Valoran retrieveValoran(int id);
}