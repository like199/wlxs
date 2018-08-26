package com.like.trip.util;

import javax.xml.bind.DatatypeConverter;

import org.springframework.stereotype.Service;
@Service
public class AudienceEntity {

	String secret="abc";
	int expiresSecond=1800;
	public String getBase64Secret()
	{
		return DatatypeConverter.printBase64Binary(secret.getBytes());
	}
	public String getClientId() {
		return "wx_id";
	}
	public String getName() {
		return "like";
	}
	public int getExpiresSecond() {
		return expiresSecond;
	}
}
