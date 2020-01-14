package br.edu.unifacear.rest;

import java.io.IOException;
import java.util.Map;

import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import br.edu.unifacear.business.BusinessException;
import br.edu.unifacear.business.PecaBusiness;

@RestController
@CrossOrigin(origins = "*")
public class ConfiguracaoController {

//	@PostMapping(value="/configuracoes/upload")
//	public ServerHttpResponse uploadFoto (MultipartHttpServletRequest request) throws IOException, BusinessException{
//		Map<String, MultipartFile> arquivo = request.getFileMap();
//		new PecaBusiness().salvarImagem(arquivo);
//		return null;
//	}
//	
}
