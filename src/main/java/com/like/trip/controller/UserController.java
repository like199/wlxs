package com.like.trip.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.like.trip.util.AccessToken;
import com.like.trip.util.AudienceEntity;
import com.like.trip.util.JwtHelper;




@RestController
@RequestMapping(value = "/user",produces = "application/json;charset=UTF-8")
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private AudienceEntity audienceEntity;
	@RequestMapping("/login")
	public AccessToken login(@RequestBody String login) {
		logger.info(login);
		Integer userId=1;
		// 拼装accessToken
					String accessToken = JwtHelper.createJWT(userId.toString(), audienceEntity.getClientId(), audienceEntity.getName(),
							audienceEntity.getExpiresSecond() * 1000, audienceEntity.getBase64Secret());

					// 返回accessToken
					AccessToken accessTokenEntity = new AccessToken();
					accessTokenEntity.setAccess_token(accessToken);
					accessTokenEntity.setExpires_in(audienceEntity.getExpiresSecond());
					accessTokenEntity.setToken_type("bearer");
					accessTokenEntity.setUserId(userId);
		return accessTokenEntity;
	}
	@RequestMapping("/check")
	public String check(@RequestBody String name) {
		return "success";
	}
}
