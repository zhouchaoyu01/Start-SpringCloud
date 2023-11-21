package com.cz.cloud;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhouchaoyu
 * @time 2023-11-12-15:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    long id;
    String key;

}
