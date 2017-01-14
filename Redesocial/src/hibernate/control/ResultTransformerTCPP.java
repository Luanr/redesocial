package hibernate.control;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.transform.ResultTransformer;

/*
public class ResultTransformerTCPP implements ResultTransformer {
/*
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("rawtypes")
	public List transformList( List list) {
//		List<TotalConsultaPorPaciente> list = new ArrayList<TotalConsultaPorPaciente>();
//		for (Object tcpp : arg0) {
//			list.add((TotalConsultaPorPaciente) tcpp);
//		}
		return list;
	}

	public TotalConsultaPorPaciente transformTuple(Object[] valores, String[] alias) {
		TotalConsultaPorPaciente object = new TotalConsultaPorPaciente();
		object.setNome((String) valores[0]);
		object.setTotalConsulta((BigInteger) valores[1]);
		return object;
	}
}*/