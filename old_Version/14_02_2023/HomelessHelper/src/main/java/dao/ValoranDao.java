package dao;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Valoran;

@Service
public interface ValoranDao {
	void addValoran(Valoran valoran);

	void removeValoran(Valoran valoran);

	List<Valoran> getValoran();

	void removeValoran(int id);

	Valoran retrieveValoran(int id);

	void updateValoran(Valoran valoran);
}