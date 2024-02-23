package org.dromara.omind.userplat.api.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Schema(description = "请求停止充电 返回数据")
@Data
public class QueryStopChargeResponseData implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "StartChargeSeq", description = "充电订单号", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(value = "StartChargeSeq")
    private String startChargeSeq;

    @Schema(name = "StartChargeSeqStat", description = "充电订单状态 1启动中，2充电中，3停止中，4已结束，5未知", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(value = "StartChargeSeqStat")
    private Short startChargeSeqStat;

    @Schema(name = "SuccStat", description = "操作结果，0成功 1失败", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(value = "SuccStat")
    private Short succStat;

    @Schema(name = "FailReason", description = "失败原因 0无 1此设备不存在 2此设备离线 3设备已停止充电 4-99自定义", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(value = "FailReason")
    private Short failReason;

}