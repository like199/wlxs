package com.like.trip.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.like.trip.exception.CustomException;
import com.like.trip.util.AudienceEntity;
import com.like.trip.util.JwtHelper;
import com.like.trip.util.ResultStatusCode;

import io.jsonwebtoken.Claims;





public class HTTPBearerAuthorizeAttribute  implements Filter{
	
	private static final Set<String> ALLOWED_PATHS = Collections.unmodifiableSet(new HashSet<>(
            Arrays.asList("/user/login")));
	
	private AudienceEntity audienceEntity=new AudienceEntity();
 
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
	            filterConfig.getServletContext());
		
	}
 
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		 System.out.println("begin doFilter");
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		String path = httpRequest.getRequestURI().substring(httpRequest.getContextPath().length()).replaceAll("[/]+$", "");
		System.out.println("path="+path);
		boolean allowedPath = ALLOWED_PATHS.contains(path);		 
        if (allowedPath) {
            System.out.println("这里是不需要处理的url进入的方法");
            chain.doFilter(request, response);
            return ;
        }
		String auth = httpRequest.getHeader("Authorization");
		if ((auth != null) && (auth.length() > 7))
		{
			String HeadStr = auth.substring(0, 6).toLowerCase();
			
			if (HeadStr.compareTo("bearer") == 0)
			{
				
				auth = auth.substring(7, auth.length()); 
				 System.out.println("auth="+auth);
				 Claims claims=JwtHelper.parseJWT(auth, audienceEntity.getBase64Secret());
				 System.out.println("userid="+claims.get("userid"));
				 System.out.println("id="+claims.getAudience());
				 System.out.println("id="+claims.getExpiration());
				 if(claims!=null)
	            {
	            	chain.doFilter(request, response);
	            	return;
	            }
			}
		}
		
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpResponse.setCharacterEncoding("UTF-8");  
		httpResponse.setContentType("application/json; charset=utf-8"); 
		httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
 
		ObjectMapper mapper = new ObjectMapper();
		
		//resultMsg = new ResultMsg(ResultStatusCode.INVALID_TOKEN.getErrorCode(), ResultStatusCode.INVALID_TOKEN.getErrorMsg(),null);
		//httpResponse.getWriter().write(mapper.writeValueAsString(resultMsg));
		throw new CustomException(ResultStatusCode.INVALID_TOKEN.getErrorCode(),ResultStatusCode.INVALID_TOKEN.getErrorMsg());
		
	}
 
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
