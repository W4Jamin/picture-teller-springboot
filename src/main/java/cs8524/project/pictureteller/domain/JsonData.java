package cs8524.project.pictureteller.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class JsonData implements Serializable {
    private static final Long serialVersionUID = 1L;

    private int statusCode;

    private Object data;

    private String errMsg;

    public JsonData(int statusCode, String errMsg) {
        this.statusCode = statusCode;
        this.errMsg = errMsg;
    }

    // 成功，传入数据
    public static JsonData buildSuccess() {
        return new JsonData(0, null, null);
    }

    // 成功，传入数据
    public static JsonData buildSuccess(Object data) {
        return new JsonData(0, data, null);
    }

    // 失败，传入描述信息
    public static JsonData buildError(String msg) {
        return new JsonData(-1, null, msg);
    }

    // 失败，传入描述信息,状态码
    public static JsonData buildError(String msg, Integer code) {
        return new JsonData(code, null, msg);
    }

    // 成功，传入数据,及描述信息
    public static JsonData buildSuccess(Object data, String msg) {
        return new JsonData(0, data, msg);
    }

    // 成功，传入数据,及状态码
    public static JsonData buildSuccess(Object data, int code) {
        return new JsonData(code, data, null);
    }

}