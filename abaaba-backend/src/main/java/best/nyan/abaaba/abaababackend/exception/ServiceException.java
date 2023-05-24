package best.nyan.abaaba.abaababackend.exception;

import best.nyan.abaaba.abaababackend.entity.ResponseResult;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class ServiceException extends RuntimeException {

    @Getter
    private Integer code;

    @Getter
    @Setter
    private String message;

    public ServiceException(int code, String message) {
        this.message = message;
    }

    public ServiceException(ResponseResult<Void> result) {
        this.code = result.getCode();
        this.message = result.getMessage();
    }

}
