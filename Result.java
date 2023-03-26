package edu.canteen.order.system.pojo;

import lombok.Data;

@Data
public class Result<T> {

	private Integer code;
	private String message;
	private T data;
	
}
