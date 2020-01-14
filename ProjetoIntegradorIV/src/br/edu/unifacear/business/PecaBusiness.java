package br.edu.unifacear.business;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Random;

//import org.springframework.web.multipart.MultipartFile;

import br.edu.unifacear.dao.Dao;
import br.edu.unifacear.dao.FabricaDao;
import br.edu.unifacear.entity.Peca;

public class PecaBusiness {
	
public void inserir(Peca peca) throws BusinessException {
		
		if (peca.getNomePeca() == null) { 
			throw new BusinessException("Erro: Nome não pode ser vazio");
		}
		
		Dao<Peca> pecaDao = FabricaDao.criarPecaDao();
		if (peca.getIdPeca() == null) {
			pecaDao.inserir(peca);
		} else {
			pecaDao.alterar(peca);
		}
	}
//public void salvarImagem(Map<String, MultipartFile> arquivo) throws BusinessException{
//	MultipartFile file = arquivo.get("file");
//    File imagem = new File(file.getOriginalFilename());
//	final String diretorio = "C:/Users/cleyton/eclipse-workspace/carroca/src/assets/";
//	Integer numero = new Random().nextInt(999);
//	String nomeImagem = numero + imagem.getName();
//	try {
//		OutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(diretorio + nomeImagem));
//		InputStream inputStream = new ByteArrayInputStream(arquivo.get("file").getBytes());
//		int token = -1;
//		while((token = inputStream.read()) != -1){
//			bufferedOutputStream.write(token);
//		}
//		bufferedOutputStream.flush();
//		bufferedOutputStream.close();
//		inputStream.close();
//		
//	} catch (Exception e) {
//		e.printStackTrace();
//		System.out.println("ConfiguracoesBusiness.salvarImagem()");
//	}
//	
//	Peca pecaImagem = new Peca();
//	System.out.println(nomeImagem);
//	pecaImagem.setPecaImagem("C:/Users/cleyton/eclipse-workspace/carroca/src/assets/" + nomeImagem);
//}
}