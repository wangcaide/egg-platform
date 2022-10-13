package xyz.wangcaide.egg.platform.core.model;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.helpers.MessageFormatter;

import java.io.Serializable;
import java.util.function.Supplier;


@Data
@Builder
@Slf4j
public class R<T> implements Serializable {

    public static final String SUCCESS = "success";
    public static final String SUCCESS_CODE = "000000";

    public static final String EMPTY_CODE = "444444";
    public static final String FAILURE_CODE = "999999";

    private String errCode;

    private String errMsg;

    private T data;

    public static R error(String errCode, String msg, String... param) {
        return R.builder().errCode(errCode)
                .errMsg(MessageFormatter.format(msg, param).getMessage())
                .build();
    }

    public static R error(String msg) {
        return error(FAILURE_CODE, msg);
    }

    public static R empty() {
        return error(EMPTY_CODE, "NOT FOUND");
    }

    public static R ok() {
        return R.builder().errCode(SUCCESS_CODE).errMsg(SUCCESS).build();
    }

    public static <T> R ok(T data) {
        return R.builder().errCode(SUCCESS_CODE).errMsg(SUCCESS).data(data).build();
    }

    public static <T> R<T> wrapper(Supplier<T> supplier) {
        try {
            return R.ok(supplier.get());
        }  catch (Exception e) {
            log.error("R wrapper catch exception", e);
            return R.error(e.getMessage());
        }
    }

}
