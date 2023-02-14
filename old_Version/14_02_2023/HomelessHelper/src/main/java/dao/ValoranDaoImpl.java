package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Valoran;

@Repository

public class ValoranDaoImpl implements ValoranDao {
	@Autowired
	ValoranJpaSpring valoranDao;

	@Override
	public void addValoran(Valoran valoran) {
		// TODO Auto-generated method stub
		valoranDao.save(valoran);
	}

	@Override
	public void removeValoran(Valoran valoran) {
		// TODO Auto-generated method stub
		valoranDao.delete(valoran);
	}

	@Override
	public List<Valoran>getValoran() {
		// TODO Auto-generated method stub
		return valoranDao.findAll();
	}

	@Override
	public void removeValoran(int id) {
		// TODO Auto-generated method stub
		valoranDao.deleteById(id);
	}

	@Override
	public Valoran retrieveValoran(int id) {
		// TODO Auto-generated method stub
		return valoranDao.findById(id).orElse(null);
	}

	@Override
	public void updateValoran(Valoran valoran) {
		// TODO Auto-generated method stub
		valoranDao.save(valoran);
	}
}
