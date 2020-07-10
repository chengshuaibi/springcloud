package vo;

import lombok.Data;

import java.util.List;

/**
 * 响应给前端的json对象
 * @author THINK
 *
 * @param <T>
 */
@Data
public class JSONResult<T> {
	/**消息*/
	private String msg;
	/**状态码   20000 表示成功,  20001 表示失败*/
	private int code;
	
	/**集合数据*/
	private List<T> records;
	
	/**单个数据*/
	private T data;
}
