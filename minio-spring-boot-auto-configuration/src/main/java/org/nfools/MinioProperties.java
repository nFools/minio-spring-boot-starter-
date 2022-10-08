package org.nfools;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author cx
 * @date 2022/10/6
 */
@ConfigurationProperties(prefix = "minio")
@Data
public class MinioProperties {

    private Provider provider = new Provider();

    @Data
    public static class Provider {

        private String endpoint;
        private String accessKey;
        private String secretKey;

    }
}
