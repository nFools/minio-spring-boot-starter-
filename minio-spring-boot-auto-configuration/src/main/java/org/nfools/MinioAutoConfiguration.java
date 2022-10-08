package org.nfools;

import io.minio.MinioClient;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author cx
 * @date 2022/10/6
 */
@EnableConfigurationProperties(MinioProperties.class)
public class MinioAutoConfiguration {

    @Bean("minioClient")
    public MinioClient minioClient(MinioProperties minioProperties) {
        MinioProperties.Provider provider = minioProperties.getProvider();
        return MinioClient.builder()
                .endpoint(provider.getEndpoint())
                .credentials(provider.getAccessKey(), provider.getSecretKey())
                .build();
    }

}
