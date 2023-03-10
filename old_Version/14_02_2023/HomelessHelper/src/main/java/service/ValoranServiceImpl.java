package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ValoranDao;
import model.Valoran;

@Service
public class ValoranServiceImpl implements ValoranService {

	@Autowired
	ValoranDao valoranDao;

	@Override
	public boolean addValoran(Valoran valoran) {
		// TODO Auto-generated method stub
		if (valoranDao.retrieveValoran(valoran.getId()) == null) {
			valoranDao.addValoran(valoran);
			return true;
		}
		return false;
	}

	@Override
	public List<Valoran> retrieveValoran() {
		// TODO Auto-generated method stub
		return valoranDao.getValoran();
	}

	@Override
	public boolean updateValoran(Valoran valoran) {
		// TODO Auto-generated method stub
		if (valoranDao.retrieveValoran(valoran.getId()) != null) {
			valoranDao.updateValoran(valoran);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteValoran(int id) {
		// TODO Auto-generated method stub
		if (valoranDao.retrieveValoran(id) != null) {
			valoranDao.removeValoran(id);
			return true;
		}
		return false;
	}

	@Override
	public Valoran retrieveValoran(int id) {
		// TODO Auto-generated method stub
		return valoranDao.retrieveValoran(id);
	}

}
