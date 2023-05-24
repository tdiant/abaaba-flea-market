package best.nyan.abaaba.abaababackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;

@Data
@AllArgsConstructor
public class ResponseResult<T> {

    private int code;
    private String message;
    private T data;

    public static <T> ResponseResult<T> of(int code, String message, T data) {
        return new ResponseResult<>(code, message, data);
    }

    public static <T> ResponseResult<T> of(int code) {
        return of(code, "", null);
    }

    public static <T> ResponseResult<T> of(int code, String message) {
        return of(code, message, null);
    }

    /**
     * 使用此方法时小心T为String时，会优先将data匹配为message的问题
     */
    public static <T> ResponseResult<T> of(int code, T data) {
        return of(code, "", data);
    }

    public static <T> ResponseResult<T> success(String message, T data) {
        return of(1, message, data);
    }

    public static <T> ResponseResult<T> success() {
        return success("success", null);
    }

    public static <T> ResponseResult<T> success(String message) {
        return success(message, null);
    }

    public static <T> ResponseResult<T> success(T data) {
        return success("success", data);
    }

    public static <T> ResponseResult<T> authFailed(String message) {
        return of(-1, message);
    }

    public static <T> ResponseResult<T> permissionDenied() {
        return of(-6, "Permission denied.");
    }

    public static <T> ResponseResult<T> invalidArgs(String message) {
        return of(-2, message);
    }

    public static <T> ResponseResult<T> invalidArgs() {
        return invalidArgs("Invalid arguments");
    }

    public static <T> ResponseResult<T> failed(String message, T data) {
        return of(2, message, data);
    }

    public static <T> ResponseResult<T> failed(String message) {
        return failed(message, null);
    }

    public static <T> ResponseResult<T> failed(T data) {
        return failed("failed", data);
    }

    public static <T> ResponseResult<T> failed() {
        return failed("failed", null);
    }

    public static class MapResponseResult extends ResponseResult<HashMap<String, Object>> {

        public MapResponseResult(int code, String message) {
            super(code, message, new HashMap<>());
        }

        public MapResponseResult put(String key, Object obj) {
            this.getData().put(key, obj);
            return this;
        }

        public static MapResponseResult gotta(int code, String message) {
            return new MapResponseResult(code, message);
        }

        public static MapResponseResult gotta(int code) {
            return gotta(code, "");
        }

        public static MapResponseResult success() {
            return gotta(1, "success");
        }

        public static MapResponseResult success(String message) {
            return gotta(1, message);
        }

        public static MapResponseResult failed() {
            return gotta(2, "failed");
        }

        public static MapResponseResult failed(String message) {
            return gotta(2, message);
        }

    }

}
