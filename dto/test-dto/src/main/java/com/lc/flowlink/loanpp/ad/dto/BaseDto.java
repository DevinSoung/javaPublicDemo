package com.lc.flowlink.loanpp.ad.dto;

import java.io.Serializable;
import java.lang.reflect.Field;

public class BaseDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Field[] fields = this.getClass().getDeclaredFields();
		for (Field f : fields) {
			f.setAccessible(true);
		}
		sb.append(this.getClass().getName()).append("#{");
		for (Field f : fields) {
			if (f.getName().contains("serialVersionUID")) continue;
			try {
				Object val = f.get(this);
				if (val != null) {
					String name = f.toString().substring(f.toString().lastIndexOf(".") + 1);
					sb.append(name).append(":").append(val).append(",");
				}
			} catch (IllegalAccessException e) {
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("}");
		return sb.toString();
	}

}
