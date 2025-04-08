//package com.zidi.flowerbackenddemo.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Entity
//@Table(name = "identification_result", schema = "flower_demo")
//public class IdentificationResult {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    public Long id;
//    public String flowerName;
//    public Integer confidence;
//}
package com.zidi.flowerbackenddemo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "identification_result", schema = "flower_demo")
public class IdentificationResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flowerName;
    private Integer confidence;
}
