package cn.houyi.base.config.exception;

import lombok.Data;

/**
 * @author houyi
 */
@Data
public class GloabException extends RuntimeException {

    private String msg;

    public GloabException(String msg){
        super(msg);
        this.msg = msg;
    }
}
