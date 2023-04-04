package kr.co.rland.web.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.beans.propertyeditors.URLEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/") 
public class HomeController {

	@PostMapping("upload") // 파일 올릴려고 하는 사람이니까 get이; 아니라 post
	@ResponseBody
	public String upload(MultipartFile[] imgs, HttpServletRequest request) throws IllegalStateException, IOException {
		
		for(int i=0 ; i<imgs.length ; i++){
			
			MultipartFile img = imgs[i];
			
			if(img.isEmpty())
				continue;
			
			String urlPath="/image/menu/"+img.getOriginalFilename();
			String realPath = request.getServletContext().getRealPath(urlPath);//this.getClass().getResource("")// 물리경로, 리소스 경로를 알아내기
			
	//		InputStream fis = img.getInputStream(); // img나 request에서 얻어올 수 있따.
	//		OutputStream fos = new FileOutputStream(realPath);

	//		byte[] buf = new byte[1024];
	//		int size = 1024;
	//		while((size = fis.read(buf))!=-1) //>=0나 !=-1 로 표현
	//			fos.write(buf, 0, size);
	//		
	//		fis.close();
	//		fos.close();
				
			img.transferTo(new File(realPath));
		}
		
//		System.out.println(realPath);
//		
//		System.out.println(img);
//		System.out.println(img.getOriginalFilename());
//		
//		realPath = this.getClass().getResource("/").getPath();
		return "ok" ;
	}
	
	
	@RequestMapping("index")     // 어노테이션)
	public String index(Model model, HttpServletResponse response) throws UnsupportedEncodingException {
		
		//String data = "hello Data";
		
		String data = URLEncoder.encode("cookie 지롱~", "utf-8");
		System.out.println(data);
		Cookie cookie = new Cookie("my", data);
		response.addCookie(cookie);
		
		model.addAttribute("data", data);
		
		return "index";
		
	
	}
}
