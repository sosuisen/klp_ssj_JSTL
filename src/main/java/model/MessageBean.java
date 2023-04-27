package model;

import java.io.Serializable;

import lombok.Data;

@Data
public class MessageBean implements Serializable {
	private String name;
	private String message;
}
